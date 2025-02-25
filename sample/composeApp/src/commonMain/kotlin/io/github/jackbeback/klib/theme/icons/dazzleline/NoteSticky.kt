package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.NoteSticky: ImageVector
    get() {
        if (_NoteSticky != null) {
            return _NoteSticky!!
        }
        _NoteSticky = ImageVector.Builder(
            name = "NoteSticky",
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
                moveTo(19.82f, 14f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 14f, 14.76f, 14f, 14.546f, 14.109f)
                curveTo(14.358f, 14.205f, 14.205f, 14.358f, 14.109f, 14.546f)
                curveTo(14f, 14.76f, 14f, 15.04f, 14f, 15.6f)
                verticalLineTo(19.82f)
                moveTo(20f, 12.727f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(12.95f)
                curveTo(13.458f, 20f, 13.712f, 20f, 13.95f, 19.941f)
                curveTo(14.161f, 19.888f, 14.362f, 19.802f, 14.545f, 19.684f)
                curveTo(14.752f, 19.552f, 14.926f, 19.368f, 15.275f, 18.998f)
                lineTo(19.125f, 14.925f)
                curveTo(19.449f, 14.583f, 19.61f, 14.412f, 19.726f, 14.216f)
                curveTo(19.828f, 14.041f, 19.903f, 13.852f, 19.949f, 13.655f)
                curveTo(20f, 13.432f, 20f, 13.197f, 20f, 12.727f)
                close()
            }
        }.build()

        return _NoteSticky!!
    }

@Suppress("ObjectPropertyName")
private var _NoteSticky: ImageVector? = null
