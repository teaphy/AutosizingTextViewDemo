package com.tea.autosizingtextviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.TextViewCompat
import android.util.TypedValue

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        setListener()

    }

    private fun initView() {

        TextViewCompat.setAutoSizeTextTypeWithDefaults(tvDefaultCode, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM)

        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(tvGranCode,
                12,
                24,
                1,
                TypedValue.COMPLEX_UNIT_SP)

        TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(tvPresetCode, intArrayOf(20, 22, 24), TypedValue.COMPLEX_UNIT_SP)
    }

    private fun setListener() {

        btnOk.setOnClickListener {
            val content = editContent.text

            tvCustom.text = content

            tvDefaultXml.text = content
            tvDefaultCode.text = content

            tvGranXML.text = content
            tvGranCode.text = content

            tvPresetXML.text = content
            tvPresetCode.text = content
        }

    }
}
