package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Record: ImageVector
    get() {
        if (_Record != null) {
            return _Record!!
        }
        _Record = ImageVector.Builder(
            name = "Record",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 17f)
                curveTo(2.462f, 17f, 0f, 14.538f, 0f, 11.5f)
                curveTo(0f, 8.462f, 2.462f, 6f, 5.5f, 6f)
                curveTo(8.538f, 6f, 11f, 8.462f, 11f, 11.5f)
                curveTo(11f, 12.83f, 10.528f, 14.049f, 9.743f, 15f)
                horizontalLineTo(14.257f)
                curveTo(13.472f, 14.049f, 13f, 12.83f, 13f, 11.5f)
                curveTo(13f, 8.462f, 15.462f, 6f, 18.5f, 6f)
                curveTo(21.538f, 6f, 24f, 8.462f, 24f, 11.5f)
                curveTo(24f, 14.538f, 21.538f, 17f, 18.5f, 17f)
                horizontalLineTo(5.5f)
                close()
                moveTo(2.015f, 11.5f)
                curveTo(2.015f, 13.425f, 3.575f, 14.985f, 5.5f, 14.985f)
                curveTo(7.425f, 14.985f, 8.985f, 13.425f, 8.985f, 11.5f)
                curveTo(8.985f, 9.575f, 7.425f, 8.015f, 5.5f, 8.015f)
                curveTo(3.575f, 8.015f, 2.015f, 9.575f, 2.015f, 11.5f)
                close()
                moveTo(15.015f, 11.5f)
                curveTo(15.015f, 13.425f, 16.575f, 14.985f, 18.5f, 14.985f)
                curveTo(20.425f, 14.985f, 21.985f, 13.425f, 21.985f, 11.5f)
                curveTo(21.985f, 9.575f, 20.425f, 8.015f, 18.5f, 8.015f)
                curveTo(16.575f, 8.015f, 15.015f, 9.575f, 15.015f, 11.5f)
                close()
            }
        }.build()

        return _Record!!
    }

@Suppress("ObjectPropertyName")
private var _Record: ImageVector? = null
