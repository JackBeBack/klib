package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeadphonesAlt1: ImageVector
    get() {
        if (_HeadphonesAlt1 != null) {
            return _HeadphonesAlt1!!
        }
        _HeadphonesAlt1 = ImageVector.Builder(
            name = "HeadphonesAlt1",
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
                moveTo(3f, 17f)
                verticalLineTo(12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                verticalLineTo(17f)
                moveTo(8.286f, 21f)
                curveTo(7.023f, 21f, 6f, 19.977f, 6f, 18.714f)
                verticalLineTo(15.286f)
                curveTo(6f, 14.023f, 7.023f, 13f, 8.286f, 13f)
                curveTo(9.232f, 13f, 10f, 13.767f, 10f, 14.714f)
                verticalLineTo(19.286f)
                curveTo(10f, 20.233f, 9.232f, 21f, 8.286f, 21f)
                close()
                moveTo(15.714f, 21f)
                curveTo(16.977f, 21f, 18f, 19.977f, 18f, 18.714f)
                verticalLineTo(15.286f)
                curveTo(18f, 14.023f, 16.977f, 13f, 15.714f, 13f)
                curveTo(14.767f, 13f, 14f, 13.767f, 14f, 14.714f)
                verticalLineTo(19.286f)
                curveTo(14f, 20.233f, 14.767f, 21f, 15.714f, 21f)
                close()
            }
        }.build()

        return _HeadphonesAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesAlt1: ImageVector? = null
