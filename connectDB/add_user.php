<?php
// Thông tin kết nối MySQL
$servername = "localhost";
$username = "root";
$password = ""; // Thay bằng mật khẩu MySQL của bạn
$dbname = "your_database_name"; // Thay bằng tên database của bạn

// Tạo kết nối
$conn = new mysqli($servername, $username, $password, $dbname);

// Kiểm tra kết nối
if ($conn->connect_error) {
    die(json_encode(["success" => false, "message" => "Kết nối thất bại: " . $conn->connect_error]));
}

// Kiểm tra phương thức HTTP
if ($_SERVER['REQUEST_METHOD'] == 'GET') {
    // Lấy dữ liệu từ query string
    $name = isset($_GET['name']) ? $_GET['name'] : null;
    $class = isset($_GET['class']) ? $_GET['class'] : null;
    $student_id = isset($_GET['student_id']) ? $_GET['student_id'] : null;
    $image = isset($_GET['image']) ? $_GET['image'] : null;
    $group_name = isset($_GET['group_name']) ? $_GET['group_name'] : null;

    // Kiểm tra dữ liệu đầu vào
    if ($name && $class && $student_id && $image && $group_name) {
        // Câu lệnh SQL với Prepared Statements
        $stmt = $conn->prepare("INSERT INTO `users` (`name`, `class`, `student_id`, `image`, `group_name`) VALUES (?, ?, ?, ?, ?)");
        $stmt->bind_param("sssss", $name, $class, $student_id, $image, $group_name);

        // Thực thi và kiểm tra kết quả
        if ($stmt->execute()) {
            echo json_encode(["success" => true, "message" => "Dữ liệu đã được chèn thành công!"]);
        } else {
            echo json_encode(["success" => false, "message" => "Lỗi khi chèn dữ liệu: " . $stmt->error]);
        }

        // Đóng Prepared Statement
        $stmt->close();
    } else {
        echo json_encode(["success" => false, "message" => "Dữ liệu đầu vào không hợp lệ!"]);
    }
} else {
    echo json_encode(["success" => false, "message" => "Chỉ hỗ trợ phương thức GET!"]);
}

// Đóng kết nối
$conn->close();
?>
