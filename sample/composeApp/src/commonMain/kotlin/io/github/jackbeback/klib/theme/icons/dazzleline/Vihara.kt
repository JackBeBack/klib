package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Vihara: ImageVector
    get() {
        if (_Vihara != null) {
            return _Vihara!!
        }
        _Vihara = ImageVector.Builder(
            name = "Vihara",
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
                moveTo(6f, 7f)
                curveTo(9f, 6f, 12f, 3f, 12f, 3f)
                curveTo(12f, 3f, 15f, 6f, 18f, 7f)
                moveTo(8f, 6.073f)
                verticalLineTo(9f)
                moveTo(8f, 9f)
                curveTo(8f, 9f, 7f, 11f, 4f, 12f)
                horizontalLineTo(20f)
                curveTo(17f, 11f, 16f, 9f, 16f, 9f)
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                moveTo(16f, 6.073f)
                verticalLineTo(9f)
                moveTo(6f, 12f)
                verticalLineTo(15f)
                moveTo(6f, 15f)
                curveTo(6f, 15f, 5f, 17f, 2f, 18f)
                horizontalLineTo(22f)
                curveTo(19f, 17f, 18f, 15f, 18f, 15f)
                moveTo(6f, 15f)
                horizontalLineTo(18f)
                moveTo(18f, 12f)
                verticalLineTo(15f)
                moveTo(5f, 18f)
                verticalLineTo(21f)
                moveTo(19f, 18f)
                verticalLineTo(21f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
            }
        }.build()

        return _Vihara!!
    }

@Suppress("ObjectPropertyName")
private var _Vihara: ImageVector? = null
