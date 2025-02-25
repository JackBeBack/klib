package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Hashtag: ImageVector
    get() {
        if (_Hashtag != null) {
            return _Hashtag!!
        }
        _Hashtag = ImageVector.Builder(
            name = "Hashtag",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.778f, 1f)
                curveTo(10.323f, 1f, 9.928f, 1.315f, 9.827f, 1.759f)
                lineTo(8.636f, 7f)
                horizontalLineTo(5f)
                curveTo(4.448f, 7f, 4f, 7.448f, 4f, 8f)
                curveTo(4f, 8.552f, 4.448f, 9f, 5f, 9f)
                horizontalLineTo(8.182f)
                lineTo(6.818f, 15f)
                horizontalLineTo(3f)
                curveTo(2.448f, 15f, 2f, 15.448f, 2f, 16f)
                curveTo(2f, 16.552f, 2.448f, 17f, 3f, 17f)
                horizontalLineTo(6.364f)
                lineTo(5.271f, 21.809f)
                curveTo(5.132f, 22.419f, 5.596f, 23f, 6.222f, 23f)
                curveTo(6.677f, 23f, 7.072f, 22.685f, 7.172f, 22.241f)
                lineTo(8.364f, 17f)
                horizontalLineTo(13.364f)
                lineTo(12.271f, 21.809f)
                curveTo(12.132f, 22.419f, 12.596f, 23f, 13.222f, 23f)
                curveTo(13.677f, 23f, 14.072f, 22.685f, 14.172f, 22.241f)
                lineTo(15.364f, 17f)
                horizontalLineTo(19f)
                curveTo(19.552f, 17f, 20f, 16.552f, 20f, 16f)
                curveTo(20f, 15.448f, 19.552f, 15f, 19f, 15f)
                horizontalLineTo(15.818f)
                lineTo(17.182f, 9f)
                horizontalLineTo(21f)
                curveTo(21.552f, 9f, 22f, 8.552f, 22f, 8f)
                curveTo(22f, 7.448f, 21.552f, 7f, 21f, 7f)
                horizontalLineTo(17.636f)
                lineTo(18.729f, 2.191f)
                curveTo(18.868f, 1.581f, 18.404f, 1f, 17.778f, 1f)
                curveTo(17.323f, 1f, 16.928f, 1.315f, 16.827f, 1.759f)
                lineTo(15.636f, 7f)
                horizontalLineTo(10.636f)
                lineTo(11.729f, 2.191f)
                curveTo(11.868f, 1.581f, 11.404f, 1f, 10.778f, 1f)
                close()
                moveTo(13.818f, 15f)
                lineTo(15.182f, 9f)
                horizontalLineTo(10.182f)
                lineTo(8.818f, 15f)
                horizontalLineTo(13.818f)
                close()
            }
        }.build()

        return _Hashtag!!
    }

@Suppress("ObjectPropertyName")
private var _Hashtag: ImageVector? = null
