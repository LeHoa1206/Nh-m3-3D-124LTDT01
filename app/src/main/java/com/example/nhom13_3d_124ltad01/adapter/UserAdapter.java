package com.example.nhom13_3d_124ltad01.adapter;

<<<<<<< HEAD
public class UserAdapter {
=======
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitapnhomlaptrinhadr_nhd_cosmetic.R;
import com.example.nhom13_3d_124ltad01.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private Context context;
    private List<User> userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);

        // Hiển thị dữ liệu người dùng
        holder.nameTextView.setText(user.getName());
        holder.classTextView.setText(user.getClassName());
        holder.studentIdTextView.setText(user.getStudentId());
        holder.groupTextView.setText(user.getGroupName());

        // Hiển thị ảnh người dùng (Base64 -> Bitmap)
        if (user.getImage() != null && !user.getImage().isEmpty()) {
            byte[] decodedString = Base64.decode(user.getImage(), Base64.DEFAULT);
            Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
            holder.profileImageView.setImageBitmap(decodedByte);
        } else {
            // Hiển thị hình ảnh mặc định nếu không có ảnh
            holder.profileImageView.setImageResource(R.drawable.ic_launcher_background);  // Đảm bảo bạn có hình ảnh placeholder
        }
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, classTextView, studentIdTextView, groupTextView;
        ImageView profileImageView;

        public UserViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.textViewName);
            classTextView = itemView.findViewById(R.id.textViewClass);
            studentIdTextView = itemView.findViewById(R.id.textViewStudentId);
            groupTextView = itemView.findViewById(R.id.textViewGroup);
            profileImageView = itemView.findViewById(R.id.imageViewProfile);
        }
    }
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9
}
