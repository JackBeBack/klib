package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SpeakerAlt1: ImageVector
    get() {
        if (_SpeakerAlt1 != null) {
            return _SpeakerAlt1!!
        }
        _SpeakerAlt1 = ImageVector.Builder(
            name = "SpeakerAlt1",
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
                moveTo(18f, 17f)
                verticalLineTo(19.4f)
                curveTo(18f, 19.96f, 18f, 20.24f, 17.891f, 20.454f)
                curveTo(17.795f, 20.642f, 17.642f, 20.795f, 17.454f, 20.891f)
                curveTo(17.24f, 21f, 16.96f, 21f, 16.4f, 21f)
                horizontalLineTo(7.6f)
                curveTo(7.04f, 21f, 6.76f, 21f, 6.546f, 20.891f)
                curveTo(6.358f, 20.795f, 6.205f, 20.642f, 6.109f, 20.454f)
                curveTo(6f, 20.24f, 6f, 19.96f, 6f, 19.4f)
                verticalLineTo(17f)
                moveTo(12f, 10f)
                horizontalLineTo(12.01f)
                moveTo(16f, 10f)
                curveTo(16f, 12.209f, 14.209f, 14f, 12f, 14f)
                curveTo(9.791f, 14f, 8f, 12.209f, 8f, 10f)
                curveTo(8f, 7.791f, 9.791f, 6f, 12f, 6f)
                curveTo(14.209f, 6f, 16f, 7.791f, 16f, 10f)
                close()
                moveTo(12.5f, 10f)
                curveTo(12.5f, 10.276f, 12.276f, 10.5f, 12f, 10.5f)
                curveTo(11.724f, 10.5f, 11.5f, 10.276f, 11.5f, 10f)
                curveTo(11.5f, 9.724f, 11.724f, 9.5f, 12f, 9.5f)
                curveTo(12.276f, 9.5f, 12.5f, 9.724f, 12.5f, 10f)
                close()
                moveTo(6.2f, 17f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 17f, 19.48f, 17f, 19.908f, 16.782f)
                curveTo(20.284f, 16.59f, 20.59f, 16.284f, 20.782f, 15.908f)
                curveTo(21f, 15.48f, 21f, 14.92f, 21f, 13.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 3f, 4.52f, 3f, 4.092f, 3.218f)
                curveTo(3.716f, 3.41f, 3.41f, 3.716f, 3.218f, 4.092f)
                curveTo(3f, 4.52f, 3f, 5.08f, 3f, 6.2f)
                verticalLineTo(13.8f)
                curveTo(3f, 14.92f, 3f, 15.48f, 3.218f, 15.908f)
                curveTo(3.41f, 16.284f, 3.716f, 16.59f, 4.092f, 16.782f)
                curveTo(4.52f, 17f, 5.08f, 17f, 6.2f, 17f)
                close()
            }
        }.build()

        return _SpeakerAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerAlt1: ImageVector? = null
