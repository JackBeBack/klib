package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DotsHorizontal: ImageVector
    get() {
        if (_DotsHorizontal != null) {
            return _DotsHorizontal!!
        }
        _DotsHorizontal = ImageVector.Builder(
            name = "DotsHorizontal",
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
                moveTo(18f, 12f)
                horizontalLineTo(18.01f)
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
                moveTo(6f, 12f)
                horizontalLineTo(6.01f)
                moveTo(13f, 12f)
                curveTo(13f, 12.552f, 12.552f, 13f, 12f, 13f)
                curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                close()
                moveTo(19f, 12f)
                curveTo(19f, 12.552f, 18.552f, 13f, 18f, 13f)
                curveTo(17.448f, 13f, 17f, 12.552f, 17f, 12f)
                curveTo(17f, 11.448f, 17.448f, 11f, 18f, 11f)
                curveTo(18.552f, 11f, 19f, 11.448f, 19f, 12f)
                close()
                moveTo(7f, 12f)
                curveTo(7f, 12.552f, 6.552f, 13f, 6f, 13f)
                curveTo(5.448f, 13f, 5f, 12.552f, 5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                close()
            }
        }.build()

        return _DotsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _DotsHorizontal: ImageVector? = null
