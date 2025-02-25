package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PollPeople: ImageVector
    get() {
        if (_PollPeople != null) {
            return _PollPeople!!
        }
        _PollPeople = ImageVector.Builder(
            name = "PollPeople",
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
                moveTo(6.001f, 4f)
                horizontalLineTo(6.011f)
                moveTo(3.172f, 10f)
                curveTo(3.584f, 8.835f, 4.695f, 8f, 6.001f, 8f)
                curveTo(7.307f, 8f, 8.419f, 8.835f, 8.83f, 10f)
                moveTo(6.001f, 15f)
                horizontalLineTo(6.011f)
                moveTo(3.172f, 21f)
                curveTo(3.584f, 19.835f, 4.695f, 19f, 6.001f, 19f)
                curveTo(7.307f, 19f, 8.419f, 19.835f, 8.83f, 21f)
                moveTo(13.601f, 8.5f)
                horizontalLineTo(19.401f)
                curveTo(19.961f, 8.5f, 20.241f, 8.5f, 20.455f, 8.391f)
                curveTo(20.643f, 8.295f, 20.796f, 8.142f, 20.892f, 7.954f)
                curveTo(21.001f, 7.74f, 21.001f, 7.46f, 21.001f, 6.9f)
                verticalLineTo(6.1f)
                curveTo(21.001f, 5.54f, 21.001f, 5.26f, 20.892f, 5.046f)
                curveTo(20.796f, 4.858f, 20.643f, 4.705f, 20.455f, 4.609f)
                curveTo(20.241f, 4.5f, 19.961f, 4.5f, 19.401f, 4.5f)
                horizontalLineTo(13.601f)
                curveTo(13.041f, 4.5f, 12.761f, 4.5f, 12.547f, 4.609f)
                curveTo(12.359f, 4.705f, 12.206f, 4.858f, 12.11f, 5.046f)
                curveTo(12.001f, 5.26f, 12.001f, 5.54f, 12.001f, 6.1f)
                verticalLineTo(6.9f)
                curveTo(12.001f, 7.46f, 12.001f, 7.74f, 12.11f, 7.954f)
                curveTo(12.206f, 8.142f, 12.359f, 8.295f, 12.547f, 8.391f)
                curveTo(12.761f, 8.5f, 13.041f, 8.5f, 13.601f, 8.5f)
                close()
                moveTo(13.601f, 19.5f)
                horizontalLineTo(19.401f)
                curveTo(19.961f, 19.5f, 20.241f, 19.5f, 20.455f, 19.391f)
                curveTo(20.643f, 19.295f, 20.796f, 19.142f, 20.892f, 18.954f)
                curveTo(21.001f, 18.74f, 21.001f, 18.46f, 21.001f, 17.9f)
                verticalLineTo(17.1f)
                curveTo(21.001f, 16.54f, 21.001f, 16.26f, 20.892f, 16.046f)
                curveTo(20.796f, 15.858f, 20.643f, 15.705f, 20.455f, 15.609f)
                curveTo(20.241f, 15.5f, 19.961f, 15.5f, 19.401f, 15.5f)
                horizontalLineTo(13.601f)
                curveTo(13.041f, 15.5f, 12.761f, 15.5f, 12.547f, 15.609f)
                curveTo(12.359f, 15.705f, 12.206f, 15.858f, 12.11f, 16.046f)
                curveTo(12.001f, 16.26f, 12.001f, 16.54f, 12.001f, 17.1f)
                verticalLineTo(17.9f)
                curveTo(12.001f, 18.46f, 12.001f, 18.74f, 12.11f, 18.954f)
                curveTo(12.206f, 19.142f, 12.359f, 19.295f, 12.547f, 19.391f)
                curveTo(12.761f, 19.5f, 13.041f, 19.5f, 13.601f, 19.5f)
                close()
                moveTo(7.001f, 4f)
                curveTo(7.001f, 4.552f, 6.553f, 5f, 6.001f, 5f)
                curveTo(5.449f, 5f, 5.001f, 4.552f, 5.001f, 4f)
                curveTo(5.001f, 3.448f, 5.449f, 3f, 6.001f, 3f)
                curveTo(6.553f, 3f, 7.001f, 3.448f, 7.001f, 4f)
                close()
                moveTo(7.001f, 15f)
                curveTo(7.001f, 15.552f, 6.553f, 16f, 6.001f, 16f)
                curveTo(5.449f, 16f, 5.001f, 15.552f, 5.001f, 15f)
                curveTo(5.001f, 14.448f, 5.449f, 14f, 6.001f, 14f)
                curveTo(6.553f, 14f, 7.001f, 14.448f, 7.001f, 15f)
                close()
            }
        }.build()

        return _PollPeople!!
    }

@Suppress("ObjectPropertyName")
private var _PollPeople: ImageVector? = null
