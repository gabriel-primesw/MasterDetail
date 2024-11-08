package ufpr.br.masterdetail.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import ufpr.br.masterdetail.R
import ufpr.br.masterdetail.model.Course

class CourseAdapter(private val context: Context, private val dataSource: List<Course>) : ArrayAdapter<Course>(context, 0, dataSource) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_course, parent, false)
        val course = dataSource[position]

        view.findViewById<ImageView>(R.id.courseImage).setImageResource(course.imageResId)
        view.findViewById<TextView>(R.id.courseTitle).text = course.title

        return view
    }
}