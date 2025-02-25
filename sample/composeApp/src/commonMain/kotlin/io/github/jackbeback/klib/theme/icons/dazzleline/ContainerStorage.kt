package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ContainerStorage: ImageVector
    get() {
        if (_ContainerStorage != null) {
            return _ContainerStorage!!
        }
        _ContainerStorage = ImageVector.Builder(
            name = "ContainerStorage",
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
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                moveTo(4f, 5f)
                verticalLineTo(19f)
                moveTo(20f, 5f)
                verticalLineTo(19f)
                moveTo(8f, 8.5f)
                verticalLineTo(15.5f)
                moveTo(16f, 8.5f)
                verticalLineTo(15.5f)
                moveTo(12f, 8.5f)
                verticalLineTo(15.5f)
            }
        }.build()

        return _ContainerStorage!!
    }

@Suppress("ObjectPropertyName")
private var _ContainerStorage: ImageVector? = null
