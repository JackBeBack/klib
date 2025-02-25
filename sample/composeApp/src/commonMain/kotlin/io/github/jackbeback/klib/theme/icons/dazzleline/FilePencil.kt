package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FilePencil: ImageVector
    get() {
        if (_FilePencil != null) {
            return _FilePencil!!
        }
        _FilePencil = ImageVector.Builder(
            name = "FilePencil",
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
                moveTo(13f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(9f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(9f, 17f)
                lineTo(10.4f, 16.72f)
                curveTo(10.576f, 16.685f, 10.665f, 16.667f, 10.747f, 16.635f)
                curveTo(10.82f, 16.606f, 10.89f, 16.569f, 10.954f, 16.524f)
                curveTo(11.027f, 16.473f, 11.09f, 16.41f, 11.218f, 16.282f)
                lineTo(14.25f, 13.25f)
                curveTo(14.664f, 12.836f, 14.664f, 12.164f, 14.25f, 11.75f)
                curveTo(13.836f, 11.336f, 13.164f, 11.336f, 12.75f, 11.75f)
                lineTo(9.718f, 14.782f)
                curveTo(9.59f, 14.91f, 9.527f, 14.973f, 9.476f, 15.046f)
                curveTo(9.431f, 15.11f, 9.394f, 15.18f, 9.365f, 15.253f)
                curveTo(9.333f, 15.335f, 9.315f, 15.424f, 9.28f, 15.6f)
                lineTo(9f, 17f)
                close()
            }
        }.build()

        return _FilePencil!!
    }

@Suppress("ObjectPropertyName")
private var _FilePencil: ImageVector? = null
