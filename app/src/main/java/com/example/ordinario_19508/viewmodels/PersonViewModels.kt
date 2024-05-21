package com.example.ordinario_19508.viewmodels

import com.example.ordinario_19508.R
import com.example.ordinario_19508.models.Person

class PersonViewModels {
    init {}

    fun getPersonList(): ArrayList<Person> {
        var personList: ArrayList<Person> = ArrayList<Person>()

        //Create list
        personList.add(Person(1, "Adivina la edad", R.drawable.pastel))
        personList.add(Person(2, "Gatos", R.drawable.gato))
        personList.add(Person(3, "NBA", R.drawable.nba))
        personList.add(Person(4, "Chuck Norris", R.drawable.chuck))

        return personList
    }
}