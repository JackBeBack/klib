package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Report: ImageVector
    get() {
        if (_Report != null) {
            return _Report!!
        }
        _Report = ImageVector.Builder(
            name = "Report",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 1f)
                curveTo(3.448f, 1f, 3f, 1.448f, 3f, 2f)
                verticalLineTo(22f)
                curveTo(3f, 22.552f, 3.448f, 23f, 4f, 23f)
                curveTo(4.552f, 23f, 5f, 22.552f, 5f, 22f)
                verticalLineTo(13.598f)
                curveTo(5.466f, 13.366f, 6.203f, 13.043f, 6.993f, 12.845f)
                curveTo(8.409f, 12.491f, 9.546f, 12.622f, 10.168f, 13.555f)
                curveTo(11.329f, 15.296f, 13.546f, 15.45f, 15.253f, 15.28f)
                curveTo(17.053f, 15.1f, 18.835f, 14.511f, 19.735f, 14.178f)
                curveTo(20.527f, 13.885f, 21f, 13.134f, 21f, 12.341f)
                verticalLineTo(5.723f)
                curveTo(21f, 4.172f, 19.358f, 3.266f, 18.049f, 3.86f)
                curveTo(16.987f, 4.341f, 15.577f, 4.879f, 14.303f, 5.056f)
                curveTo(12.97f, 5.242f, 12.196f, 4.991f, 11.832f, 4.445f)
                curveTo(10.52f, 2.478f, 8.276f, 2.245f, 6.667f, 2.379f)
                curveTo(6.049f, 2.43f, 5.476f, 2.538f, 5f, 2.652f)
                verticalLineTo(2f)
                curveTo(5f, 1.448f, 4.552f, 1f, 4f, 1f)
                close()
                moveTo(5f, 4.721f)
                verticalLineTo(11.405f)
                curveTo(5.441f, 11.225f, 5.956f, 11.043f, 6.507f, 10.905f)
                curveTo(8.091f, 10.509f, 10.454f, 10.379f, 11.832f, 12.446f)
                curveTo(12.311f, 13.163f, 13.413f, 13.453f, 15.054f, 13.29f)
                curveTo(16.576f, 13.138f, 18.142f, 12.632f, 19f, 12.317f)
                verticalLineTo(5.723f)
                curveTo(19f, 5.678f, 18.908f, 5.666f, 18.875f, 5.681f)
                curveTo(17.757f, 6.188f, 16.14f, 6.82f, 14.579f, 7.037f)
                curveTo(13.078f, 7.246f, 11.21f, 7.119f, 10.168f, 5.555f)
                curveTo(9.48f, 4.523f, 8.224f, 4.256f, 6.833f, 4.372f)
                curveTo(6.124f, 4.431f, 5.464f, 4.586f, 5f, 4.721f)
                close()
            }
        }.build()

        return _Report!!
    }

@Suppress("ObjectPropertyName")
private var _Report: ImageVector? = null
