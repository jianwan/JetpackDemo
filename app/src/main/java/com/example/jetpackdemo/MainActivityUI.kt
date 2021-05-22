package com.example.jetpackdemo

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class MainActivityUI {

    @Composable
    fun Counter(count: Int, updateCount: (Int) -> Unit) {
        Button(
            onClick = { updateCount(count + 1) },
        ) {
            Text("I've been clicked $count times")
        }
    }


    @Preview
    @Composable
    fun PreviewCounter() {
        val counterState = remember { mutableStateOf(0) }
        Counter(
            count = counterState.value,
            updateCount = { newCount ->
                counterState.value = newCount
            }
        )
    }

}