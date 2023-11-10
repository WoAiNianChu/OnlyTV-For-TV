package com.quiet.onlytv.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.quiet.onlytv.R
import com.quiet.onlytv.utils.OnKeyListener

/**
 *
 *  author： ludoven
 *  date :   2023/11/10 13:55
 *
 */
class RecommendAdapter(mutableList: MutableList<String>,private val onKeyListener: OnKeyListener) :
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.rv_recommend, mutableList) {
    override fun convert(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.title, item)
            .setText(R.id.des, "An adorable, super-powered puppy leaps into action")

        holder.itemView.setOnKeyListener { view, i, keyEvent ->
            return@setOnKeyListener onKeyListener.onKeyDown(holder.bindingAdapterPosition,i,keyEvent)
        }
    }

}