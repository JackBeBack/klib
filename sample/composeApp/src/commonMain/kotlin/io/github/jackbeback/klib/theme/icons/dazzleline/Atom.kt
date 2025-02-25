package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Atom: ImageVector
    get() {
        if (_Atom != null) {
            return _Atom!!
        }
        _Atom = ImageVector.Builder(
            name = "Atom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 12f)
                verticalLineTo(14f)
                curveTo(13.105f, 14f, 14f, 13.104f, 14f, 12f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 12f)
                horizontalLineTo(10f)
                curveTo(10f, 13.104f, 10.896f, 14f, 12f, 14f)
                verticalLineTo(12f)
                close()
                moveTo(12f, 12f)
                verticalLineTo(10f)
                curveTo(10.896f, 10f, 10f, 10.895f, 10f, 12f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 12f)
                horizontalLineTo(14f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                verticalLineTo(12f)
                close()
                moveTo(12f, 13f)
                horizontalLineTo(12.01f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                close()
                moveTo(14.829f, 14.828f)
                curveTo(12.758f, 16.899f, 10.535f, 18.357f, 8.649f, 19.064f)
                curveTo(6.671f, 19.806f, 5.458f, 19.6f, 4.929f, 19.071f)
                lineTo(3.515f, 20.485f)
                curveTo(4.939f, 21.909f, 7.235f, 21.73f, 9.351f, 20.936f)
                curveTo(11.561f, 20.108f, 14.018f, 18.468f, 16.243f, 16.243f)
                lineTo(14.829f, 14.828f)
                close()
                moveTo(4.929f, 19.071f)
                curveTo(4.401f, 18.542f, 4.195f, 17.329f, 4.937f, 15.351f)
                curveTo(5.644f, 13.466f, 7.101f, 11.242f, 9.172f, 9.172f)
                lineTo(7.758f, 7.757f)
                curveTo(5.532f, 9.982f, 3.892f, 12.439f, 3.064f, 14.649f)
                curveTo(2.27f, 16.765f, 2.091f, 19.061f, 3.515f, 20.485f)
                lineTo(4.929f, 19.071f)
                close()
                moveTo(9.172f, 9.172f)
                curveTo(11.243f, 7.101f, 13.466f, 5.643f, 15.351f, 4.936f)
                curveTo(17.33f, 4.194f, 18.543f, 4.4f, 19.071f, 4.929f)
                lineTo(20.486f, 3.515f)
                curveTo(19.061f, 2.091f, 16.765f, 2.27f, 14.649f, 3.064f)
                curveTo(12.44f, 3.892f, 9.983f, 5.532f, 7.758f, 7.757f)
                lineTo(9.172f, 9.172f)
                close()
                moveTo(19.071f, 4.929f)
                curveTo(19.6f, 5.457f, 19.806f, 6.671f, 19.064f, 8.649f)
                curveTo(18.357f, 10.534f, 16.899f, 12.758f, 14.829f, 14.828f)
                lineTo(16.243f, 16.243f)
                curveTo(18.468f, 14.017f, 20.108f, 11.56f, 20.937f, 9.351f)
                curveTo(21.73f, 7.235f, 21.91f, 4.939f, 20.486f, 3.515f)
                lineTo(19.071f, 4.929f)
                close()
                moveTo(14.829f, 9.172f)
                curveTo(16.899f, 11.242f, 18.357f, 13.466f, 19.064f, 15.351f)
                curveTo(19.806f, 17.329f, 19.6f, 18.542f, 19.071f, 19.071f)
                lineTo(20.486f, 20.485f)
                curveTo(21.91f, 19.061f, 21.73f, 16.765f, 20.937f, 14.649f)
                curveTo(20.108f, 12.439f, 18.468f, 9.982f, 16.243f, 7.757f)
                lineTo(14.829f, 9.172f)
                close()
                moveTo(19.071f, 19.071f)
                curveTo(18.543f, 19.6f, 17.33f, 19.806f, 15.351f, 19.064f)
                curveTo(13.466f, 18.357f, 11.243f, 16.899f, 9.172f, 14.828f)
                lineTo(7.758f, 16.243f)
                curveTo(9.983f, 18.468f, 12.44f, 20.108f, 14.649f, 20.936f)
                curveTo(16.765f, 21.73f, 19.061f, 21.909f, 20.486f, 20.485f)
                lineTo(19.071f, 19.071f)
                close()
                moveTo(9.172f, 14.828f)
                curveTo(7.101f, 12.758f, 5.644f, 10.534f, 4.937f, 8.649f)
                curveTo(4.195f, 6.671f, 4.401f, 5.457f, 4.929f, 4.929f)
                lineTo(3.515f, 3.515f)
                curveTo(2.091f, 4.939f, 2.27f, 7.235f, 3.064f, 9.351f)
                curveTo(3.892f, 11.56f, 5.532f, 14.017f, 7.758f, 16.243f)
                lineTo(9.172f, 14.828f)
                close()
                moveTo(4.929f, 4.929f)
                curveTo(5.458f, 4.4f, 6.671f, 4.194f, 8.649f, 4.936f)
                curveTo(10.535f, 5.643f, 12.758f, 7.101f, 14.829f, 9.172f)
                lineTo(16.243f, 7.757f)
                curveTo(14.018f, 5.532f, 11.561f, 3.892f, 9.351f, 3.064f)
                curveTo(7.235f, 2.27f, 4.939f, 2.091f, 3.515f, 3.515f)
                lineTo(4.929f, 4.929f)
                close()
            }
        }.build()

        return _Atom!!
    }

@Suppress("ObjectPropertyName")
private var _Atom: ImageVector? = null
