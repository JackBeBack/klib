package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Wristwatch: ImageVector
    get() {
        if (_Wristwatch != null) {
            return _Wristwatch!!
        }
        _Wristwatch = ImageVector.Builder(
            name = "Wristwatch",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 9f)
                curveTo(13f, 8.448f, 12.552f, 8f, 12f, 8f)
                curveTo(11.448f, 8f, 11f, 8.448f, 11f, 9f)
                verticalLineTo(11.586f)
                curveTo(11f, 12.116f, 11.211f, 12.625f, 11.586f, 13f)
                lineTo(13.293f, 14.707f)
                curveTo(13.683f, 15.098f, 14.317f, 15.098f, 14.707f, 14.707f)
                curveTo(15.098f, 14.317f, 15.098f, 13.683f, 14.707f, 13.293f)
                lineTo(13f, 11.586f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 5.755f)
                verticalLineTo(3f)
                curveTo(7f, 1.343f, 8.343f, 0f, 10f, 0f)
                horizontalLineTo(14f)
                curveTo(15.657f, 0f, 17f, 1.343f, 17f, 3f)
                verticalLineTo(5.755f)
                curveTo(18.584f, 7.024f, 19.674f, 8.884f, 19.938f, 11f)
                curveTo(20.504f, 11f, 21f, 11.407f, 21f, 12f)
                curveTo(21f, 12.593f, 20.504f, 13f, 19.938f, 13f)
                curveTo(19.674f, 15.116f, 18.584f, 16.976f, 17f, 18.245f)
                verticalLineTo(21f)
                curveTo(17f, 22.657f, 15.657f, 24f, 14f, 24f)
                horizontalLineTo(10f)
                curveTo(8.343f, 24f, 7f, 22.657f, 7f, 21f)
                lineTo(7f, 18.245f)
                curveTo(5.171f, 16.779f, 4f, 14.526f, 4f, 12f)
                curveTo(4f, 9.474f, 5.171f, 7.221f, 7f, 5.755f)
                close()
                moveTo(9f, 3f)
                curveTo(9f, 2.448f, 9.448f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.552f, 2f, 15f, 2.448f, 15f, 3f)
                verticalLineTo(4.582f)
                curveTo(14.074f, 4.207f, 13.061f, 4f, 12f, 4f)
                curveTo(10.939f, 4f, 9.926f, 4.207f, 9f, 4.582f)
                verticalLineTo(3f)
                close()
                moveTo(12f, 20f)
                curveTo(13.061f, 20f, 14.074f, 19.794f, 15f, 19.419f)
                verticalLineTo(21f)
                curveTo(15f, 21.552f, 14.552f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.448f, 22f, 9f, 21.552f, 9f, 21f)
                lineTo(9f, 19.419f)
                curveTo(9.926f, 19.794f, 10.939f, 20f, 12f, 20f)
                close()
                moveTo(6.027f, 12f)
                curveTo(6.027f, 15.299f, 8.701f, 17.973f, 12f, 17.973f)
                curveTo(15.299f, 17.973f, 17.973f, 15.299f, 17.973f, 12f)
                curveTo(17.973f, 8.701f, 15.299f, 6.027f, 12f, 6.027f)
                curveTo(8.701f, 6.027f, 6.027f, 8.701f, 6.027f, 12f)
                close()
            }
        }.build()

        return _Wristwatch!!
    }

@Suppress("ObjectPropertyName")
private var _Wristwatch: ImageVector? = null
