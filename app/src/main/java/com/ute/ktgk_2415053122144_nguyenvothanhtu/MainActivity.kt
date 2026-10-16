package com.ute.ktgk_2415053122144_nguyenvothanhtu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtTenKhoanChi_123: EditText
    private lateinit var edtSoTien_123: EditText
    private lateinit var edtGhiChu_123: EditText
    private lateinit var btnThemKhoanChi_123: Button
    private lateinit var btnXemChiTiet_123: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ view
        edtTenKhoanChi_123 = findViewById(R.id.edtTenKhoanChi_123)
        edtSoTien_123 = findViewById(R.id.edtSoTien_123)
        edtGhiChu_123 = findViewById(R.id.edtGhiChu_123)
        btnThemKhoanChi_123 = findViewById(R.id.btnThemKhoanChi_123)
        btnXemChiTiet_123 = findViewById(R.id.btnXemChiTiet_123)

        // Xử lý nút Thêm khoản chi
        btnThemKhoanChi_123.setOnClickListener {
            val tenKhoanChi_123 = edtTenKhoanChi_123.text.toString().trim()
            val soTienStr_123 = edtSoTien_123.text.toString().trim()
            val ghiChu_123 = edtGhiChu_123.text.toString().trim()

            if (tenKhoanChi_123.isEmpty()) {
                edtTenKhoanChi_123.error = "Vui lòng nhập tên khoản chi"
                return@setOnClickListener
            }
            if (soTienStr_123.isEmpty()) {
                edtSoTien_123.error = "Vui lòng nhập số tiền"
                return@setOnClickListener
            }

            val soTien_123 = soTienStr_123.toDoubleOrNull()
            if (soTien_123 == null || soTien_123 <= 0) {
                edtSoTien_123.error = "Số tiền phải là số dương"
                return@setOnClickListener
            }

            android.widget.Toast.makeText(
                this,
                "Đã thêm: $tenKhoanChi_123 - $soTien_123 VNĐ",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        }

        // Xử lý nút Xem chi tiết
        btnXemChiTiet_123.setOnClickListener {
            // Sẽ làm ở Câu 2
            android.widget.Toast.makeText(
                this, "Chuyển sang màn hình chi tiết", android.widget.Toast.LENGTH_SHORT
            ).show()
        }
    }

}