package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LandmarkFlag: ImageVector
    get() {
        if (_LandmarkFlag != null) {
            return _LandmarkFlag!!
        }
        _LandmarkFlag = ImageVector.Builder(
            name = "LandmarkFlag",
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
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                moveTo(6f, 18f)
                verticalLineTo(14f)
                moveTo(10f, 18f)
                verticalLineTo(14f)
                moveTo(14f, 18f)
                verticalLineTo(14f)
                moveTo(18f, 18f)
                verticalLineTo(14f)
                moveTo(12f, 7f)
                horizontalLineTo(16.84f)
                curveTo(16.896f, 7f, 16.924f, 7f, 16.945f, 6.989f)
                curveTo(16.964f, 6.98f, 16.979f, 6.964f, 16.989f, 6.945f)
                curveTo(17f, 6.924f, 17f, 6.896f, 17f, 6.84f)
                verticalLineTo(4.16f)
                curveTo(17f, 4.104f, 17f, 4.076f, 16.989f, 4.055f)
                curveTo(16.979f, 4.036f, 16.964f, 4.02f, 16.945f, 4.011f)
                curveTo(16.924f, 4f, 16.896f, 4f, 16.84f, 4f)
                horizontalLineTo(12f)
                moveTo(12f, 11f)
                verticalLineTo(3f)
            }
        }.build()

        return _LandmarkFlag!!
    }

@Suppress("ObjectPropertyName")
private var _LandmarkFlag: ImageVector? = null
