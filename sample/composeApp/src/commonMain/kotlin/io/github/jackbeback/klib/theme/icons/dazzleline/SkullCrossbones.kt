package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SkullCrossbones: ImageVector
    get() {
        if (_SkullCrossbones != null) {
            return _SkullCrossbones!!
        }
        _SkullCrossbones = ImageVector.Builder(
            name = "SkullCrossbones",
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
                moveTo(10f, 7f)
                horizontalLineTo(10.01f)
                moveTo(14f, 7f)
                horizontalLineTo(14.01f)
                moveTo(3f, 14f)
                lineTo(21f, 21f)
                moveTo(21f, 14f)
                lineTo(3f, 21f)
                moveTo(18f, 8.5f)
                curveTo(18f, 5.462f, 15.314f, 3f, 12f, 3f)
                curveTo(8.686f, 3f, 6f, 5.462f, 6f, 8.5f)
                curveTo(6f, 9.502f, 8.489f, 10.441f, 9f, 11.25f)
                curveTo(9.71f, 12.375f, 9f, 14f, 10f, 14f)
                curveTo(10f, 14f, 11.299f, 14f, 12f, 14f)
                curveTo(12.701f, 14f, 13.5f, 14f, 14f, 14f)
                curveTo(15f, 14f, 14.29f, 12.375f, 15f, 11.25f)
                curveTo(15.51f, 10.441f, 18f, 9.502f, 18f, 8.5f)
                close()
            }
        }.build()

        return _SkullCrossbones!!
    }

@Suppress("ObjectPropertyName")
private var _SkullCrossbones: ImageVector? = null
