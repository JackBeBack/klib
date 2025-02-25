package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodeFork: ImageVector
    get() {
        if (_CodeFork != null) {
            return _CodeFork!!
        }
        _CodeFork = ImageVector.Builder(
            name = "CodeFork",
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
                moveTo(12f, 16f)
                curveTo(10.619f, 16f, 9.5f, 17.119f, 9.5f, 18.5f)
                curveTo(9.5f, 19.881f, 10.619f, 21f, 12f, 21f)
                curveTo(13.381f, 21f, 14.5f, 19.881f, 14.5f, 18.5f)
                curveTo(14.5f, 17.119f, 13.381f, 16f, 12f, 16f)
                close()
                moveTo(12f, 16f)
                verticalLineTo(12f)
                moveTo(5.5f, 8f)
                curveTo(6.881f, 8f, 8f, 6.881f, 8f, 5.5f)
                curveTo(8f, 4.119f, 6.881f, 3f, 5.5f, 3f)
                curveTo(4.119f, 3f, 3f, 4.119f, 3f, 5.5f)
                curveTo(3f, 6.881f, 4.119f, 8f, 5.5f, 8f)
                close()
                moveTo(5.5f, 8f)
                verticalLineTo(8.8f)
                curveTo(5.5f, 9.92f, 5.5f, 10.48f, 5.718f, 10.908f)
                curveTo(5.91f, 11.284f, 6.216f, 11.59f, 6.592f, 11.782f)
                curveTo(7.02f, 12f, 7.58f, 12f, 8.7f, 12f)
                horizontalLineTo(15.3f)
                curveTo(16.42f, 12f, 16.98f, 12f, 17.408f, 11.782f)
                curveTo(17.784f, 11.59f, 18.09f, 11.284f, 18.282f, 10.908f)
                curveTo(18.5f, 10.48f, 18.5f, 9.92f, 18.5f, 8.8f)
                verticalLineTo(8f)
                moveTo(18.5f, 8f)
                curveTo(19.881f, 8f, 21f, 6.881f, 21f, 5.5f)
                curveTo(21f, 4.119f, 19.881f, 3f, 18.5f, 3f)
                curveTo(17.119f, 3f, 16f, 4.119f, 16f, 5.5f)
                curveTo(16f, 6.881f, 17.119f, 8f, 18.5f, 8f)
                close()
            }
        }.build()

        return _CodeFork!!
    }

@Suppress("ObjectPropertyName")
private var _CodeFork: ImageVector? = null
