package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LandmarkDome: ImageVector
    get() {
        if (_LandmarkDome != null) {
            return _LandmarkDome!!
        }
        _LandmarkDome = ImageVector.Builder(
            name = "LandmarkDome",
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
                moveTo(18f, 10f)
                curveTo(18f, 6.686f, 15.314f, 4f, 12f, 4f)
                moveTo(6f, 10f)
                curveTo(6f, 6.686f, 8.686f, 4f, 12f, 4f)
                moveTo(12f, 4f)
                verticalLineTo(3f)
                moveTo(3f, 10f)
                horizontalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(6f)
                moveTo(6f, 18f)
                horizontalLineTo(10f)
                moveTo(6f, 18f)
                verticalLineTo(13f)
                moveTo(10f, 18f)
                horizontalLineTo(14f)
                moveTo(10f, 18f)
                verticalLineTo(13f)
                moveTo(14f, 18f)
                horizontalLineTo(18f)
                moveTo(14f, 18f)
                verticalLineTo(13f)
                moveTo(18f, 18f)
                horizontalLineTo(21f)
                moveTo(18f, 18f)
                verticalLineTo(13f)
            }
        }.build()

        return _LandmarkDome!!
    }

@Suppress("ObjectPropertyName")
private var _LandmarkDome: ImageVector? = null
