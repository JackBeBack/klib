package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSleet: ImageVector
    get() {
        if (_CloudSleet != null) {
            return _CloudSleet!!
        }
        _CloudSleet = ImageVector.Builder(
            name = "CloudSleet",
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
                moveTo(6f, 18f)
                lineTo(4f, 21f)
                moveTo(9.5f, 20f)
                verticalLineTo(19f)
                moveTo(9.5f, 19f)
                verticalLineTo(18f)
                moveTo(9.5f, 19f)
                horizontalLineTo(10.5f)
                moveTo(9.5f, 19f)
                horizontalLineTo(8.5f)
                moveTo(14.5f, 18f)
                lineTo(12.5f, 21f)
                moveTo(18f, 20f)
                verticalLineTo(19f)
                moveTo(18f, 19f)
                verticalLineTo(18f)
                moveTo(18f, 19f)
                horizontalLineTo(19f)
                moveTo(18f, 19f)
                horizontalLineTo(17f)
                moveTo(8.8f, 15f)
                curveTo(6.149f, 15f, 4f, 12.947f, 4f, 10.414f)
                curveTo(4f, 8.314f, 5.6f, 6.375f, 8f, 6f)
                curveTo(8.753f, 4.274f, 10.535f, 3f, 12.613f, 3f)
                curveTo(15.275f, 3f, 17.45f, 4.991f, 17.6f, 7.5f)
                curveTo(19.013f, 8.096f, 20f, 9.557f, 20f, 11.14f)
                curveTo(20f, 13.272f, 18.209f, 15f, 16f, 15f)
                lineTo(8.8f, 15f)
                close()
            }
        }.build()

        return _CloudSleet!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSleet: ImageVector? = null
