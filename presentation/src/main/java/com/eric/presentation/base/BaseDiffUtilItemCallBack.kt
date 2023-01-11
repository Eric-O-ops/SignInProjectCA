package com.eric.presentation.base

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

interface BaseDiffUtilItemCallBack {
    val name: String

    class Base<B : BaseDiffUtilItemCallBack> : DiffUtil.ItemCallback<B>() {

        override fun areItemsTheSame(oldItem: B, newItem: B) = oldItem.name == newItem.name

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: B, newItem: B) = oldItem == newItem

    }
}