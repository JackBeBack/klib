package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneOffice: ImageVector
    get() {
        if (_PhoneOffice != null) {
            return _PhoneOffice!!
        }
        _PhoneOffice = ImageVector.Builder(
            name = "PhoneOffice",
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
                moveTo(21f, 10f)
                horizontalLineTo(14.6f)
                curveTo(14.04f, 10f, 13.76f, 10f, 13.546f, 9.891f)
                curveTo(13.358f, 9.795f, 13.205f, 9.642f, 13.109f, 9.454f)
                curveTo(13f, 9.24f, 13f, 8.96f, 13f, 8.4f)
                verticalLineTo(5f)
                moveTo(10f, 5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 5f, 19.48f, 5f, 19.908f, 5.218f)
                curveTo(20.284f, 5.41f, 20.59f, 5.716f, 20.782f, 6.092f)
                curveTo(21f, 6.52f, 21f, 7.08f, 21f, 8.2f)
                verticalLineTo(17.8f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.494f, 5.013f, 5.012f, 5.001f, 6f, 5f)
                moveTo(10f, 5f)
                verticalLineTo(4.6f)
                curveTo(10f, 4.04f, 10f, 3.76f, 9.891f, 3.546f)
                curveTo(9.795f, 3.358f, 9.642f, 3.205f, 9.454f, 3.109f)
                curveTo(9.24f, 3f, 8.96f, 3f, 8.4f, 3f)
                horizontalLineTo(7.6f)
                curveTo(7.04f, 3f, 6.76f, 3f, 6.546f, 3.109f)
                curveTo(6.358f, 3.205f, 6.205f, 3.358f, 6.109f, 3.546f)
                curveTo(6f, 3.76f, 6f, 4.04f, 6f, 4.6f)
                verticalLineTo(5f)
                moveTo(10f, 5f)
                verticalLineTo(15.4f)
                curveTo(10f, 15.96f, 10f, 16.24f, 9.891f, 16.454f)
                curveTo(9.795f, 16.642f, 9.642f, 16.795f, 9.454f, 16.891f)
                curveTo(9.24f, 17f, 8.96f, 17f, 8.4f, 17f)
                horizontalLineTo(7.6f)
                curveTo(7.04f, 17f, 6.76f, 17f, 6.546f, 16.891f)
                curveTo(6.358f, 16.795f, 6.205f, 16.642f, 6.109f, 16.454f)
                curveTo(6f, 16.24f, 6f, 15.96f, 6f, 15.4f)
                verticalLineTo(5f)
                moveTo(14f, 14f)
                horizontalLineTo(14.01f)
                verticalLineTo(13.99f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                close()
                moveTo(14f, 17f)
                horizontalLineTo(14.01f)
                verticalLineTo(17.01f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                close()
                moveTo(17f, 17f)
                horizontalLineTo(17.01f)
                verticalLineTo(17.01f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
                moveTo(17f, 14f)
                horizontalLineTo(17.01f)
                verticalLineTo(14.01f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _PhoneOffice!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneOffice: ImageVector? = null
