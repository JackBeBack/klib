package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AddressBook: ImageVector
    get() {
        if (_AddressBook != null) {
            return _AddressBook!!
        }
        _AddressBook = ImageVector.Builder(
            name = "AddressBook",
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
                moveTo(13.5f, 15.5f)
                curveTo(13.216f, 14.359f, 11.981f, 13.5f, 10.5f, 13.5f)
                curveTo(9.019f, 13.5f, 7.784f, 14.359f, 7.5f, 15.5f)
                moveTo(21f, 5f)
                verticalLineTo(7f)
                moveTo(21f, 11f)
                verticalLineTo(13f)
                moveTo(21f, 17f)
                verticalLineTo(19f)
                moveTo(6.2f, 21f)
                horizontalLineTo(14.8f)
                curveTo(15.92f, 21f, 16.48f, 21f, 16.908f, 20.782f)
                curveTo(17.284f, 20.59f, 17.59f, 20.284f, 17.782f, 19.908f)
                curveTo(18f, 19.48f, 18f, 18.92f, 18f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(18f, 5.08f, 18f, 4.52f, 17.782f, 4.092f)
                curveTo(17.59f, 3.716f, 17.284f, 3.41f, 16.908f, 3.218f)
                curveTo(16.48f, 3f, 15.92f, 3f, 14.8f, 3f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 3f, 4.52f, 3f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3f, 4.52f, 3f, 5.08f, 3f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(3f, 18.92f, 3f, 19.48f, 3.218f, 19.908f)
                curveTo(3.41f, 20.284f, 3.716f, 20.59f, 4.092f, 20.782f)
                curveTo(4.52f, 21f, 5.08f, 21f, 6.2f, 21f)
                close()
                moveTo(11.5f, 9.5f)
                curveTo(11.5f, 10.052f, 11.052f, 10.5f, 10.5f, 10.5f)
                curveTo(9.948f, 10.5f, 9.5f, 10.052f, 9.5f, 9.5f)
                curveTo(9.5f, 8.948f, 9.948f, 8.5f, 10.5f, 8.5f)
                curveTo(11.052f, 8.5f, 11.5f, 8.948f, 11.5f, 9.5f)
                close()
            }
        }.build()

        return _AddressBook!!
    }

@Suppress("ObjectPropertyName")
private var _AddressBook: ImageVector? = null
