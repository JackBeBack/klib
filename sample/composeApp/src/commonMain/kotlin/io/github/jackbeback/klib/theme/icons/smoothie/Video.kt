package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Video",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 11.5f)
                horizontalLineTo(3f)
                verticalLineTo(20.5f)
                curveTo(3f, 21.052f, 3.448f, 21.5f, 4f, 21.5f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21.5f, 21f, 21.052f, 21f, 20.5f)
                verticalLineTo(12.5f)
                curveTo(21f, 11.948f, 20.552f, 11.5f, 20f, 11.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.6f, 7.4f)
                lineTo(17.575f, 1.586f)
                curveTo(18.094f, 1.397f, 18.668f, 1.664f, 18.857f, 2.183f)
                lineTo(19.541f, 4.063f)
                curveTo(19.729f, 4.582f, 19.462f, 5.156f, 18.943f, 5.344f)
                lineTo(2.968f, 11.159f)
                lineTo(1.6f, 7.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f
            ) {
                moveTo(15.695f, 2.27f)
                lineTo(15.184f, 6.713f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f
            ) {
                moveTo(11.937f, 3.638f)
                lineTo(11.425f, 8.081f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f
            ) {
                moveTo(8.178f, 5.006f)
                lineTo(7.667f, 9.449f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f
            ) {
                moveTo(4.419f, 6.374f)
                lineTo(3.908f, 10.817f)
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
