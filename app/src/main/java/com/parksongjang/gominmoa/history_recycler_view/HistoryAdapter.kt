package com.parksongjang.gominmoa.history_recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.parksongjang.gominmoa.R
import com.parksongjang.gominmoa.data.History
import com.parksongjang.gominmoa.enum.BookCategory
import java.time.format.DateTimeFormatter

class HistoryAdapter(val data: MutableList<History>): Adapter<HistoryViewHolder>() {
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_history, parent, false))
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.view.findViewById<TextView>(R.id.question_textview).text = data[position].question
        holder.view.findViewById<TextView>(R.id.answer_textview).text = data[position].advice
        holder.view.findViewById<TextView>(R.id.book_textview).text = if(data[position].type == BookCategory.TBOOK) "따끔한 한마디" else "위로의 한마디"
        holder.view.findViewById<TextView>(R.id.date_textview).text = data[position].date.format(
            DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        holder.view.findViewById<ImageView>(R.id.delete_button).setOnClickListener {
            data.removeAt(holder.adapterPosition)
            notifyItemRemoved(holder.adapterPosition)
        }
    }
}