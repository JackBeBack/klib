package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleDollar: ImageVector
    get() {
        if (_CircleDollar != null) {
            return _CircleDollar!!
        }
        _CircleDollar = ImageVector.Builder(
            name = "CircleDollar",
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
                moveTo(15f, 10f)
                verticalLineTo(9.917f)
                curveTo(15f, 8.858f, 14.142f, 8f, 13.083f, 8f)
                horizontalLineTo(11f)
                curveTo(9.895f, 8f, 9f, 8.895f, 9f, 10f)
                curveTo(9f, 11.105f, 9.895f, 12f, 11f, 12f)
                horizontalLineTo(13f)
                curveTo(14.105f, 12f, 15f, 12.895f, 15f, 14f)
                curveTo(15f, 15.105f, 14.105f, 16f, 13f, 16f)
                horizontalLineTo(10.958f)
                curveTo(9.877f, 16f, 9f, 15.123f, 9f, 14.042f)
                verticalLineTo(14f)
                moveTo(12f, 17.5f)
                verticalLineTo(6.5f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _CircleDollar!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDollar: ImageVector? = null
