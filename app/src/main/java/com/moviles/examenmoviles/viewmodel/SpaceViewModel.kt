package com.moviles.examenmoviles.viewmodel

import androidx.lifecycle.ViewModel
import com.moviles.examenmoviles.data.MockData
import com.moviles.examenmoviles.model.CoworkingSpace
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SpaceViewModel : ViewModel() {
    private val _spaces = MutableStateFlow<List<CoworkingSpace>>(MockData.coworkingSpaces)
    val spaces: StateFlow<List<CoworkingSpace>> = _spaces.asStateFlow()

    private val _selectedSpace = MutableStateFlow<CoworkingSpace?>(null)
    val selectedSpace: StateFlow<CoworkingSpace?> = _selectedSpace.asStateFlow()

    fun selectSpace(space: CoworkingSpace) {
        _selectedSpace.value = space
    }
}
