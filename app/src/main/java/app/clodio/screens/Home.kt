package app.clodio.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.clodio.model.Alarm
import app.clodio.model.Alarm.Companion.getRandomAlarm

@Composable
fun Home() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AlarmList()
    }
}

@Composable
fun AlarmList() {
    LazyColumn(
        modifier = Modifier
            .offset(y = 100.dp)
            .size(width = 350.dp, height = 500.dp)
            .background(
                Color.DarkGray,
                shape = RoundedCornerShape(10.dp)
            ),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        val randomAlarms: List<Alarm> = (1..10).map{getRandomAlarm()}

        items(randomAlarms) { alarm ->
            AlarmBox(alarm)
        }
    }
}

@Composable
fun AlarmBox(alarm : Alarm) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(
                Color.LightGray,
                shape = RoundedCornerShape(10.dp)
            )
            .clickable(){}
    ) {
        Text(
            text = alarm.time.toString(),
            fontSize = 20.sp,
            fontWeight = FontWeight(100),
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 10.dp)
        )
    }
}