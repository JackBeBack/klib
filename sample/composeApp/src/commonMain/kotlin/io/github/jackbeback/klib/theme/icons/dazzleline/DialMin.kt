package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DialMin: ImageVector
    get() {
        if (_DialMin != null) {
            return _DialMin!!
        }
        _DialMin = ImageVector.Builder(
            name = "DialMin",
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
                moveTo(20.5f, 13f)
                horizontalLineTo(20.49f)
                moveTo(12f, 4.5f)
                horizontalLineTo(11.99f)
                moveTo(3.5f, 13f)
                horizontalLineTo(3.49f)
                moveTo(18f, 7f)
                horizontalLineTo(17.99f)
                moveTo(6f, 7f)
                horizontalLineTo(5.99f)
                moveTo(18f, 19f)
                horizontalLineTo(17.99f)
                moveTo(6f, 19f)
                horizontalLineTo(5.99f)
                moveTo(9.172f, 15.828f)
                curveTo(10.734f, 17.39f, 13.266f, 17.39f, 14.828f, 15.828f)
                curveTo(16.39f, 14.266f, 16.39f, 11.734f, 14.828f, 10.172f)
                curveTo(13.266f, 8.609f, 10.734f, 8.609f, 9.172f, 10.172f)
                curveTo(7.609f, 11.734f, 7.609f, 14.266f, 9.172f, 15.828f)
                close()
                moveTo(9.172f, 15.828f)
                lineTo(12f, 13f)
                moveTo(20f, 13f)
                curveTo(20f, 13.276f, 20.224f, 13.5f, 20.5f, 13.5f)
                curveTo(20.776f, 13.5f, 21f, 13.276f, 21f, 13f)
                curveTo(21f, 12.724f, 20.776f, 12.5f, 20.5f, 12.5f)
                curveTo(20.224f, 12.5f, 20f, 12.724f, 20f, 13f)
                close()
                moveTo(11.5f, 4.5f)
                curveTo(11.5f, 4.776f, 11.724f, 5f, 12f, 5f)
                curveTo(12.276f, 5f, 12.5f, 4.776f, 12.5f, 4.5f)
                curveTo(12.5f, 4.224f, 12.276f, 4f, 12f, 4f)
                curveTo(11.724f, 4f, 11.5f, 4.224f, 11.5f, 4.5f)
                close()
                moveTo(3f, 13f)
                curveTo(3f, 12.724f, 3.224f, 12.5f, 3.5f, 12.5f)
                curveTo(3.776f, 12.5f, 4f, 12.724f, 4f, 13f)
                curveTo(4f, 13.276f, 3.776f, 13.5f, 3.5f, 13.5f)
                curveTo(3.224f, 13.5f, 3f, 13.276f, 3f, 13f)
                close()
                moveTo(17.5f, 7f)
                curveTo(17.5f, 7.276f, 17.724f, 7.5f, 18f, 7.5f)
                curveTo(18.276f, 7.5f, 18.5f, 7.276f, 18.5f, 7f)
                curveTo(18.5f, 6.724f, 18.276f, 6.5f, 18f, 6.5f)
                curveTo(17.724f, 6.5f, 17.5f, 6.724f, 17.5f, 7f)
                close()
                moveTo(5.5f, 7f)
                curveTo(5.5f, 6.724f, 5.724f, 6.5f, 6f, 6.5f)
                curveTo(6.276f, 6.5f, 6.5f, 6.724f, 6.5f, 7f)
                curveTo(6.5f, 7.276f, 6.276f, 7.5f, 6f, 7.5f)
                curveTo(5.724f, 7.5f, 5.5f, 7.276f, 5.5f, 7f)
                close()
                moveTo(17.5f, 19f)
                curveTo(17.5f, 19.276f, 17.724f, 19.5f, 18f, 19.5f)
                curveTo(18.276f, 19.5f, 18.5f, 19.276f, 18.5f, 19f)
                curveTo(18.5f, 18.724f, 18.276f, 18.5f, 18f, 18.5f)
                curveTo(17.724f, 18.5f, 17.5f, 18.724f, 17.5f, 19f)
                close()
                moveTo(5.5f, 19f)
                curveTo(5.5f, 18.724f, 5.724f, 18.5f, 6f, 18.5f)
                curveTo(6.276f, 18.5f, 6.5f, 18.724f, 6.5f, 19f)
                curveTo(6.5f, 19.276f, 6.276f, 19.5f, 6f, 19.5f)
                curveTo(5.724f, 19.5f, 5.5f, 19.276f, 5.5f, 19f)
                close()
            }
        }.build()

        return _DialMin!!
    }

@Suppress("ObjectPropertyName")
private var _DialMin: ImageVector? = null
