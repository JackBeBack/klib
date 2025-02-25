package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GalleryThumbnails: ImageVector
    get() {
        if (_GalleryThumbnails != null) {
            return _GalleryThumbnails!!
        }
        _GalleryThumbnails = ImageVector.Builder(
            name = "GalleryThumbnails",
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
                moveTo(3f, 8.2f)
                curveTo(3f, 7.08f, 3f, 6.52f, 3.218f, 6.092f)
                curveTo(3.41f, 5.716f, 3.716f, 5.41f, 4.092f, 5.218f)
                curveTo(4.52f, 5f, 5.08f, 5f, 6.2f, 5f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 5f, 19.48f, 5f, 19.908f, 5.218f)
                curveTo(20.284f, 5.41f, 20.59f, 5.716f, 20.782f, 6.092f)
                curveTo(21f, 6.52f, 21f, 7.08f, 21f, 8.2f)
                verticalLineTo(10.8f)
                curveTo(21f, 11.92f, 21f, 12.48f, 20.782f, 12.908f)
                curveTo(20.59f, 13.284f, 20.284f, 13.59f, 19.908f, 13.782f)
                curveTo(19.48f, 14f, 18.92f, 14f, 17.8f, 14f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 14f, 4.52f, 14f, 4.092f, 13.782f)
                curveTo(3.716f, 13.59f, 3.41f, 13.284f, 3.218f, 12.908f)
                curveTo(3f, 12.48f, 3f, 11.92f, 3f, 10.8f)
                verticalLineTo(8.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _GalleryThumbnails!!
    }

@Suppress("ObjectPropertyName")
private var _GalleryThumbnails: ImageVector? = null
