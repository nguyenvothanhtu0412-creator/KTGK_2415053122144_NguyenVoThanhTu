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
    }
}