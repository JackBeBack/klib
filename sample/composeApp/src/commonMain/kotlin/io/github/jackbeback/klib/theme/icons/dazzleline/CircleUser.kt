package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleUser: ImageVector
    get() {
        if (_CircleUser != null) {
            return _CircleUser!!
        }
        _CircleUser = ImageVector.Builder(
            name = "CircleUser",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.03f, 19.401f)
                curveTo(5.975f, 19.951f, 6.376f, 20.441f, 6.926f, 20.495f)
                curveTo(7.475f, 20.55f, 7.965f, 20.148f, 8.02f, 19.599f)
                lineTo(6.03f, 19.401f)
                close()
                moveTo(15.98f, 19.599f)
                curveTo(16.035f, 20.148f, 16.524f, 20.55f, 17.074f, 20.495f)
                curveTo(17.624f, 20.441f, 18.025f, 19.951f, 17.97f, 19.401f)
                lineTo(15.98f, 19.599f)
                close()
                moveTo(20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                verticalLineTo(22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                horizontalLineTo(20f)
                close()
                moveTo(12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                horizontalLineTo(2f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                verticalLineTo(20f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                verticalLineTo(2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                horizontalLineTo(4f)
                close()
                moveTo(12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                horizontalLineTo(22f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                verticalLineTo(4f)
                close()
                moveTo(13f, 10f)
                curveTo(13f, 10.552f, 12.552f, 11f, 12f, 11f)
                verticalLineTo(13f)
                curveTo(13.657f, 13f, 15f, 11.657f, 15f, 10f)
                horizontalLineTo(13f)
                close()
                moveTo(12f, 11f)
                curveTo(11.448f, 11f, 11f, 10.552f, 11f, 10f)
                horizontalLineTo(9f)
                curveTo(9f, 11.657f, 10.343f, 13f, 12f, 13f)
                verticalLineTo(11f)
                close()
                moveTo(11f, 10f)
                curveTo(11f, 9.448f, 11.448f, 9f, 12f, 9f)
                verticalLineTo(7f)
                curveTo(10.343f, 7f, 9f, 8.343f, 9f, 10f)
                horizontalLineTo(11f)
                close()
                moveTo(12f, 9f)
                curveTo(12.552f, 9f, 13f, 9.448f, 13f, 10f)
                horizontalLineTo(15f)
                curveTo(15f, 8.343f, 13.657f, 7f, 12f, 7f)
                verticalLineTo(9f)
                close()
                moveTo(8.02f, 19.599f)
                curveTo(8.22f, 17.579f, 9.926f, 16f, 12f, 16f)
                verticalLineTo(14f)
                curveTo(8.888f, 14f, 6.331f, 16.368f, 6.03f, 19.401f)
                lineTo(8.02f, 19.599f)
                close()
                moveTo(12f, 16f)
                curveTo(14.073f, 16f, 15.78f, 17.579f, 15.98f, 19.599f)
                lineTo(17.97f, 19.401f)
                curveTo(17.669f, 16.368f, 15.112f, 14f, 12f, 14f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _CircleUser!!
    }

@Suppress("ObjectPropertyName")
private var _CircleUser: ImageVector? = null
