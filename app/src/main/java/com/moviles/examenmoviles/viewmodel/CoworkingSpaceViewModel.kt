package com.moviles.examenmoviles.viewmodel

import androidx.lifecycle.ViewModel
import com.moviles.examenmoviles.data.MockData
import com.moviles.examenmoviles.model.CoworkingSpace
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CoworkingSpaceViewModel : ViewModel() {
    
    // UI State for the list of spaces
    private val _spaces = MutableStateFlow<List<CoworkingSpace>>(emptyList())
    val spaces: StateFlow<List<CoworkingSpace>> = _spaces.asStateFlow()

    // UI State for the currently selected space (for detail screen)
    private val _selectedSpace = MutableStateFlow<CoworkingSpace?>(null)
    val selectedSpace: StateFlow<CoworkingSpace?> = _selectedSpace.asStateFlow()

    init {
        loadSpaces()
    }

    private fun loadSpaces() {
        // In a real app, this would be a call to a repository/API
        _spaces.value = MockData.coworkingSpaces
    }

    fun getSpaceById(id: Int) {
        _selectedSpace.value = MockData.coworkingSpaces.find { it.id == id }
    }

    fun clearSelection() {
        _selectedSpace.value = null
    }
}
