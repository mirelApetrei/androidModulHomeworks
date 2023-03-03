package de.syntax_institut.myapplication.data

import de.syntax_institut.myapplication.R
import de.syntax_institut.myapplication.data.model.Specie

class Datasource {

    fun loadSpecie(): List<Specie>{
        return listOf(
            Specie(
                R.string.animalName1,
                R.string.animalLocation1,
                R.drawable.pangolin1,
                R.string.animalInfo1
            ),
            Specie(
                R.string.animalName2,
                R.string.animalLocation2,
                R.drawable.philippine_eagle2,
                R.string.animalInfo2
            ),
            Specie(
                R.string.animalName3,
                R.string.animalLocation3,
                R.drawable.ti_liger3,
                R.string.animalInfo3
            ),
            Specie(
                R.string.animalName4,
                R.string.animalLocation4,
                R.drawable.saola4,
                R.string.animalInfo4
            ),
            Specie(
                R.string.animalName5,
                R.string.animalLocation5,
                R.drawable.mountain_gorila5,
                R.string.animalInfo5
            ),
            Specie(
                R.string.animalName6,
                R.string.animalLocation6,
                R.drawable.black_tiger6,
                R.string.animalInfo6
            ),
            Specie(
                R.string.animalName7,
                R.string.animalLocation7,
                R.drawable.yangtze7,
                R.string.animalInfo7
            ),
            Specie(
                R.string.animalName8,
                R.string.animalLocation8,
                R.drawable.turtle8,
                R.string.animalInfo8
            ),
            Specie(
                R.string.animalName9,
                R.string.animalLocation9,
                R.drawable.dragon_fly9,
                R.string.animalInfo9
            ),
            Specie(
                R.string.animalName10,
                R.string.animalLocation10,
                R.drawable.black_footed_ferret10,
                R.string.animalInfo10
            ),

        )
    }
}