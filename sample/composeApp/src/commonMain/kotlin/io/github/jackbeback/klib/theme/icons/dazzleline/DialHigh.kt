package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DialHigh: ImageVector
    get() {
        if (_DialHigh != null) {
            return _DialHigh!!
        }
        _DialHigh = ImageVector.Builder(
            name = "DialHigh",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(16f, 13f)
                curveTo(16f, 15.209f, 14.209f, 17f, 12f, 17f)
                curveTo(9.791f, 17f, 8f, 15.209f, 8f, 13f)
                curveTo(8f, 10.791f, 9.791f, 9f, 12f, 9f)
                curveTo(14.209f, 9f, 16f, 10.791f, 16f, 13f)
                close()
                moveTo(16f, 13f)
                horizontalLineTo(12f)
                moveTo(3.5f, 13f)
                horizontalLineTo(3.51f)
                moveTo(12f, 4.5f)
                horizontalLineTo(12.01f)
                moveTo(20.5f, 13f)
                horizontalLineTo(20.51f)
                moveTo(6f, 7f)
                horizontalLineTo(6.01f)
                moveTo(18f, 7f)
                horizontalLineTo(18.01f)
                moveTo(6f, 19f)
                horizontalLineTo(6.01f)
                moveTo(18f, 19f)
                horizontalLineTo(18.01f)
                moveTo(4f, 13f)
                curveTo(4f, 13.276f, 3.776f, 13.5f, 3.5f, 13.5f)
                curveTo(3.224f, 13.5f, 3f, 13.276f, 3f, 13f)
                curveTo(3f, 12.724f, 3.224f, 12.5f, 3.5f, 12.5f)
                curveTo(3.776f, 12.5f, 4f, 12.724f, 4f, 13f)
                close()
                moveTo(12.5f, 4.5f)
                curveTo(12.5f, 4.776f, 12.276f, 5f, 12f, 5f)
                curveTo(11.724f, 5f, 11.5f, 4.776f, 11.5f, 4.5f)
                curveTo(11.5f, 4.224f, 11.724f, 4f, 12f, 4f)
                curveTo(12.276f, 4f, 12.5f, 4.224f, 12.5f, 4.5f)
                close()
                moveTo(21f, 13f)
                curveTo(21f, 12.724f, 20.776f, 12.5f, 20.5f, 12.5f)
                curveTo(20.224f, 12.5f, 20f, 12.724f, 20f, 13f)
                curveTo(20f, 13.276f, 20.224f, 13.5f, 20.5f, 13.5f)
                curveTo(20.776f, 13.5f, 21f, 13.276f, 21f, 13f)
                close()
                moveTo(6.5f, 7f)
                curveTo(6.5f, 7.276f, 6.276f, 7.5f, 6f, 7.5f)
                curveTo(5.724f, 7.5f, 5.5f, 7.276f, 5.5f, 7f)
                curveTo(5.5f, 6.724f, 5.724f, 6.5f, 6f, 6.5f)
                curveTo(6.276f, 6.5f, 6.5f, 6.724f, 6.5f, 7f)
                close()
                moveTo(18.5f, 7f)
                curveTo(18.5f, 6.724f, 18.276f, 6.5f, 18f, 6.5f)
                curveTo(17.724f, 6.5f, 17.5f, 6.724f, 17.5f, 7f)
                curveTo(17.5f, 7.276f, 17.724f, 7.5f, 18f, 7.5f)
                curveTo(18.276f, 7.5f, 18.5f, 7.276f, 18.5f, 7f)
                close()
                moveTo(6.5f, 19f)
                curveTo(6.5f, 19.276f, 6.276f, 19.5f, 6f, 19.5f)
                curveTo(5.724f, 19.5f, 5.5f, 19.276f, 5.5f, 19f)
                curveTo(5.5f, 18.724f, 5.724f, 18.5f, 6f, 18.5f)
                curveTo(6.276f, 18.5f, 6.5f, 18.724f, 6.5f, 19f)
                close()
                moveTo(18.5f, 19f)
                curveTo(18.5f, 18.724f, 18.276f, 18.5f, 18f, 18.5f)
                curveTo(17.724f, 18.5f, 17.5f, 18.724f, 17.5f, 19f)
                curveTo(17.5f, 19.276f, 17.724f, 19.5f, 18f, 19.5f)
                curveTo(18.276f, 19.5f, 18.5f, 19.276f, 18.5f, 19f)
                close()
            }
        }.build()

        return _DialHigh!!
    }

@Suppress("ObjectPropertyName")
private var _DialHigh: ImageVector? = null
