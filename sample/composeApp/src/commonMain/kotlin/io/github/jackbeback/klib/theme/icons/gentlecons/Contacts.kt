package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Contacts: ImageVector
    get() {
        if (_Contacts != null) {
            return _Contacts!!
        }
        _Contacts = ImageVector.Builder(
            name = "Contacts",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 8f)
                curveTo(16f, 10.209f, 14.209f, 12f, 12f, 12f)
                curveTo(9.791f, 12f, 8f, 10.209f, 8f, 8f)
                curveTo(8f, 5.791f, 9.791f, 4f, 12f, 4f)
                curveTo(14.209f, 4f, 16f, 5.791f, 16f, 8f)
                close()
                moveTo(9.977f, 8f)
                curveTo(9.977f, 9.117f, 10.883f, 10.023f, 12f, 10.023f)
                curveTo(13.117f, 10.023f, 14.023f, 9.117f, 14.023f, 8f)
                curveTo(14.023f, 6.883f, 13.117f, 5.977f, 12f, 5.977f)
                curveTo(10.883f, 5.977f, 9.977f, 6.883f, 9.977f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.399f, 16.681f)
                curveTo(6.49f, 13.829f, 9.471f, 13f, 12f, 13f)
                curveTo(14.529f, 13f, 17.51f, 13.829f, 18.601f, 16.681f)
                curveTo(18.951f, 17.595f, 18.683f, 18.476f, 18.136f, 19.078f)
                curveTo(17.61f, 19.658f, 16.822f, 20f, 16f, 20f)
                horizontalLineTo(8f)
                curveTo(7.178f, 20f, 6.39f, 19.658f, 5.864f, 19.078f)
                curveTo(5.317f, 18.476f, 5.049f, 17.595f, 5.399f, 16.681f)
                close()
                moveTo(12f, 15f)
                curveTo(9.723f, 15f, 7.899f, 15.743f, 7.267f, 17.395f)
                curveTo(7.218f, 17.523f, 7.255f, 17.635f, 7.345f, 17.734f)
                curveTo(7.475f, 17.877f, 7.717f, 18f, 8f, 18f)
                horizontalLineTo(16f)
                curveTo(16.283f, 18f, 16.525f, 17.877f, 16.655f, 17.734f)
                curveTo(16.745f, 17.635f, 16.782f, 17.523f, 16.733f, 17.395f)
                curveTo(16.101f, 15.743f, 14.276f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _Contacts!!
    }

@Suppress("ObjectPropertyName")
private var _Contacts: ImageVector? = null
