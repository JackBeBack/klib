package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.LocationDefine: ImageVector
    get() {
        if (_LocationDefine != null) {
            return _LocationDefine!!
        }
        _LocationDefine = ImageVector.Builder(
            name = "LocationDefine",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 16.502f)
                curveTo(14.485f, 16.502f, 16.5f, 14.487f, 16.5f, 12.002f)
                curveTo(16.5f, 9.516f, 14.485f, 7.502f, 12f, 7.502f)
                curveTo(9.515f, 7.502f, 7.5f, 9.516f, 7.5f, 12.002f)
                curveTo(7.5f, 14.487f, 9.515f, 16.502f, 12f, 16.502f)
                close()
                moveTo(12f, 14.503f)
                curveTo(10.618f, 14.503f, 9.498f, 13.383f, 9.498f, 12.002f)
                curveTo(9.498f, 10.62f, 10.618f, 9.5f, 12f, 9.5f)
                curveTo(13.382f, 9.5f, 14.502f, 10.62f, 14.502f, 12.002f)
                curveTo(14.502f, 13.383f, 13.382f, 14.503f, 12f, 14.503f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 1f)
                curveTo(11f, 0.448f, 11.448f, 0f, 12f, 0f)
                curveTo(12.552f, 0f, 13f, 0.448f, 13f, 1f)
                verticalLineTo(2.049f)
                curveTo(17.724f, 2.518f, 21.482f, 6.276f, 21.951f, 11f)
                horizontalLineTo(23f)
                curveTo(23.552f, 11f, 24f, 11.448f, 24f, 12f)
                curveTo(24f, 12.552f, 23.552f, 13f, 23f, 13f)
                horizontalLineTo(21.951f)
                curveTo(21.482f, 17.724f, 17.724f, 21.482f, 13f, 21.951f)
                verticalLineTo(23f)
                curveTo(13f, 23.552f, 12.552f, 24f, 12f, 24f)
                curveTo(11.448f, 24f, 11f, 23.552f, 11f, 23f)
                verticalLineTo(21.951f)
                curveTo(6.276f, 21.482f, 2.518f, 17.724f, 2.049f, 13f)
                horizontalLineTo(1f)
                curveTo(0.448f, 13f, 0f, 12.552f, 0f, 12f)
                curveTo(-0f, 11.448f, 0.448f, 11f, 1f, 11f)
                horizontalLineTo(2.049f)
                curveTo(2.518f, 6.276f, 6.276f, 2.518f, 11f, 2.049f)
                verticalLineTo(1f)
                close()
                moveTo(12f, 20.002f)
                curveTo(7.581f, 20.002f, 3.998f, 16.419f, 3.998f, 12f)
                curveTo(3.998f, 7.581f, 7.581f, 3.998f, 12f, 3.998f)
                curveTo(16.419f, 3.998f, 20.002f, 7.581f, 20.002f, 12f)
                curveTo(20.002f, 16.419f, 16.419f, 20.002f, 12f, 20.002f)
                close()
            }
        }.build()

        return _LocationDefine!!
    }

@Suppress("ObjectPropertyName")
private var _LocationDefine: ImageVector? = null
