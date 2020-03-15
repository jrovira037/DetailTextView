package com.jroviraa.detailtextview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class DetailTextView : LinearLayout {

    // components
    private lateinit var view: View
    private lateinit var imageView: ImageView
    private lateinit var textViewHeader: TextView
    private lateinit var textViewContent: TextView

    // data
    private var headerText: String = ""
    private var contentText: String = ""
    private var iconPath: Int? = null


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
        imageView = view.findViewById(R.id.detailTextViewIcon)
        textViewHeader = view.findViewById(R.id.detailTextViewHeader)
        textViewContent = view.findViewById(R.id.detailTextViewContent)

        render()
    }

    private fun render() {
        if (iconPath != -1) {
            imageView.setImageResource(iconPath!!)
        } else {
            imageView.setImageBitmap(null)
        }

        textViewHeader.text = headerText
        textViewContent.text = contentText
    }

    /*
     * PUBLIC FUNCTIONS
     */

    fun setOnClickListener(callback: (Unit) -> Unit) {
        view.setOnClickListener {
            callback.invoke(Unit)

        }
    }

    fun setHeader(text: String) {
        headerText = text
        render()
    }

    fun setText(text: String) {
        contentText = text
        render()
    }

    fun setIcon(resourceId: Int) {
        iconPath = resourceId
        render()
    }
}