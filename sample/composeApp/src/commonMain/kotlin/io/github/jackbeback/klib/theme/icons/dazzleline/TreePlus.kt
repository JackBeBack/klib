package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TreePlus: ImageVector
    get() {
        if (_TreePlus != null) {
            return _TreePlus!!
        }
        _TreePlus = ImageVector.Builder(
            name = "TreePlus",
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
                moveTo(9f, 10f)
                lineTo(5f, 15f)
                horizontalLineTo(8f)
                lineTo(4f, 21f)
                horizontalLineTo(20f)
                lineTo(16f, 15f)
                horizontalLineTo(19f)
                lineTo(15f, 10f)
                moveTo(12f, 3f)
                verticalLineTo(9f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                moveTo(11f, 14f)
                horizontalLineTo(11.01f)
                moveTo(14f, 18f)
                horizontalLineTo(14.01f)
            }
        }.build()

        return _TreePlus!!
    }

@Suppress("ObjectPropertyName")
private var _TreePlus: ImageVector? = null
