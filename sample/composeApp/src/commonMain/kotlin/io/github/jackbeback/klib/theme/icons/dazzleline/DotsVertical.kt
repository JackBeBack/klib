package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DotsVertical: ImageVector
    get() {
        if (_DotsVertical != null) {
            return _DotsVertical!!
        }
        _DotsVertical = ImageVector.Builder(
            name = "DotsVertical",
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
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
                moveTo(12f, 6f)
                horizontalLineTo(12.01f)
                moveTo(12f, 18f)
                horizontalLineTo(12.01f)
                moveTo(13f, 12f)
                curveTo(13f, 12.552f, 12.552f, 13f, 12f, 13f)
                curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                close()
                moveTo(13f, 18f)
                curveTo(13f, 18.552f, 12.552f, 19f, 12f, 19f)
                curveTo(11.448f, 19f, 11f, 18.552f, 11f, 18f)
                curveTo(11f, 17.448f, 11.448f, 17f, 12f, 17f)
                curveTo(12.552f, 17f, 13f, 17.448f, 13f, 18f)
                close()
                moveTo(13f, 6f)
                curveTo(13f, 6.552f, 12.552f, 7f, 12f, 7f)
                curveTo(11.448f, 7f, 11f, 6.552f, 11f, 6f)
                curveTo(11f, 5.448f, 11.448f, 5f, 12f, 5f)
                curveTo(12.552f, 5f, 13f, 5.448f, 13f, 6f)
                close()
            }
        }.build()

        return _DotsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _DotsVertical: ImageVector? = null
