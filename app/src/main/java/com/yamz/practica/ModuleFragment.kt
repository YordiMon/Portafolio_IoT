package com.yamz.practica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class ModuleFragment : Fragment() {

    private var selectedOption: Int = 0
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myView = inflater.inflate(R.layout.fragment_module, container, false)

        val spinner = myView.findViewById<Spinner>(R.id.spinner)

        val convertOptions = resources.getStringArray(R.array.convert_options)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, convertOptions)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        return myView
    }
}