package br.senai.sp.jandira.bmi.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

data class Bmi(
    var bmi: Pair<String, Double>,
    var bmiStatus: BmiStatus = BmiStatus.NORMAL,
    var color: Color = Color.White
)
