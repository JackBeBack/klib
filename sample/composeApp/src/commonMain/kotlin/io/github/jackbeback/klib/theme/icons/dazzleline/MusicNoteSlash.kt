package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MusicNoteSlash: ImageVector
    get() {
        if (_MusicNoteSlash != null) {
            return _MusicNoteSlash!!
        }
        _MusicNoteSlash = ImageVector.Builder(
            name = "MusicNoteSlash",
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
                moveTo(12.5f, 6.893f)
                verticalLineTo(5.577f)
                curveTo(12.5f, 5.369f, 12.5f, 5.266f, 12.535f, 5.177f)
                curveTo(12.565f, 5.099f, 12.615f, 5.031f, 12.679f, 4.977f)
                curveTo(12.752f, 4.916f, 12.85f, 4.883f, 13.047f, 4.818f)
                lineTo(17.447f, 3.351f)
                curveTo(17.802f, 3.232f, 17.98f, 3.173f, 18.122f, 3.209f)
                curveTo(18.246f, 3.24f, 18.353f, 3.317f, 18.422f, 3.425f)
                curveTo(18.5f, 3.548f, 18.5f, 3.735f, 18.5f, 4.11f)
                verticalLineTo(7.423f)
                curveTo(18.5f, 7.631f, 18.5f, 7.734f, 18.465f, 7.823f)
                curveTo(18.435f, 7.901f, 18.385f, 7.969f, 18.321f, 8.023f)
                curveTo(18.248f, 8.084f, 18.15f, 8.117f, 17.953f, 8.182f)
                lineTo(14.819f, 9.227f)
                moveTo(12.5f, 12.5f)
                verticalLineTo(18.5f)
                moveTo(12.5f, 18.5f)
                curveTo(12.5f, 19.881f, 10.933f, 21f, 9f, 21f)
                curveTo(7.067f, 21f, 5.5f, 19.881f, 5.5f, 18.5f)
                curveTo(5.5f, 17.119f, 7.067f, 16f, 9f, 16f)
                curveTo(10.933f, 16f, 12.5f, 17.119f, 12.5f, 18.5f)
                close()
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _MusicNoteSlash!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteSlash: ImageVector? = null
