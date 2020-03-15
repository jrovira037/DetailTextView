package com.jroviraa.detailtextview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class DetailTextView : LinearLayout {

    private lateinit var view: View

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        init(context, attrs)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context, attrs)
    }

    private fun init(context: Context?, attrs: AttributeSet?) {
        var headerText: String
        var contentText: String
        var iconPath: Int?

        context!!.theme.obtainStyledAttributes(
            attrs,
            R.styleable.DetailTextView,
            0, 0
        ).apply {

            try {
                headerText = getString(R.styleable.DetailTextView_title) ?: ""
                contentText = getString(R.styleable.DetailTextView_text) ?: ""
                iconPath = getResourceId(R.styleable.DetailTextView_icon, -1)
            } finally {
                recycle()
            }
        }

        view = View.inflate(context, R.layout.detail_text_view_layout, this)

        val imageView = view.findViewById<ImageView>(R.id.detailTextViewIcon)
        val textViewHeader = view.findViewById<TextView>(R.id.detailTextViewHeader)
        val textViewContent = view.findViewById<TextView>(R.id.detailTextViewContent)

        if (iconPath != -1) {
            imageView.setImageResource(iconPath!!)
        } else {
            imageView.setImageBitmap(null)
        }

        textViewHeader.text = headerText
        textViewContent.text = contentText
    }

    fun setOnClickListener(callback: (Unit) -> Unit) {
        view.setOnClickListener {
            callback.invoke(Unit)

        }
    }
}