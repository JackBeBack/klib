package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PartyHorn: ImageVector
    get() {
        if (_PartyHorn != null) {
            return _PartyHorn!!
        }
        _PartyHorn = ImageVector.Builder(
            name = "PartyHorn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.571f, 14.5f)
                lineTo(9.466f, 18.414f)
                moveTo(19f, 3.61f)
                curveTo(17.404f, 3.595f, 16.666f, 4.332f, 16.424f, 5.077f)
                curveTo(16.21f, 5.734f, 16.405f, 7.077f, 15.896f, 8.073f)
                curveTo(15.409f, 9.024f, 14.12f, 9.562f, 12.657f, 9.607f)
                moveTo(20f, 7.61f)
                lineTo(20.01f, 7.61f)
                moveTo(19f, 15.96f)
                lineTo(19.01f, 15.96f)
                moveTo(7f, 3.949f)
                lineTo(7.01f, 3.949f)
                moveTo(19f, 11.109f)
                curveTo(17.5f, 11.109f, 16.5f, 11.609f, 15.595f, 12.545f)
                moveTo(10.238f, 7.188f)
                curveTo(11f, 6.11f, 11.5f, 5.11f, 11.008f, 3.527f)
                moveTo(3.536f, 20.465f)
                lineTo(7.071f, 9.858f)
                lineTo(14.142f, 16.929f)
                lineTo(3.536f, 20.465f)
                close()
            }
        }.build()

        return _PartyHorn!!
    }

@Suppress("ObjectPropertyName")
private var _PartyHorn: ImageVector? = null
