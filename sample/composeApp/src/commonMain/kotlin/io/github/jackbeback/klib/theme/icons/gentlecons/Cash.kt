package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cash: ImageVector
    get() {
        if (_Cash != null) {
            return _Cash!!
        }
        _Cash = ImageVector.Builder(
            name = "Cash",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 16f)
                curveTo(14.209f, 16f, 16f, 14.209f, 16f, 12f)
                curveTo(16f, 9.791f, 14.209f, 8f, 12f, 8f)
                curveTo(9.791f, 8f, 8f, 9.791f, 8f, 12f)
                curveTo(8f, 14.209f, 9.791f, 16f, 12f, 16f)
                close()
                moveTo(12f, 14.097f)
                curveTo(10.842f, 14.097f, 9.903f, 13.158f, 9.903f, 12f)
                curveTo(9.903f, 10.842f, 10.842f, 9.903f, 12f, 9.903f)
                curveTo(13.158f, 9.903f, 14.097f, 10.842f, 14.097f, 12f)
                curveTo(14.097f, 13.158f, 13.158f, 14.097f, 12f, 14.097f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 12f)
                curveTo(7f, 12.552f, 6.552f, 13f, 6f, 13f)
                curveTo(5.448f, 13f, 5f, 12.552f, 5f, 12f)
                curveTo(5f, 11.448f, 5.448f, 11f, 6f, 11f)
                curveTo(6.552f, 11f, 7f, 11.448f, 7f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 13f)
                curveTo(18.552f, 13f, 19f, 12.552f, 19f, 12f)
                curveTo(19f, 11.448f, 18.552f, 11f, 18f, 11f)
                curveTo(17.448f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.552f, 17.448f, 13f, 18f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 5f)
                curveTo(22.657f, 5f, 24f, 6.343f, 24f, 8f)
                verticalLineTo(16f)
                curveTo(24f, 17.657f, 22.657f, 19f, 21f, 19f)
                horizontalLineTo(3f)
                curveTo(1.343f, 19f, 0f, 17.657f, 0f, 16f)
                verticalLineTo(8f)
                curveTo(0f, 6.343f, 1.343f, 5f, 3f, 5f)
                horizontalLineTo(21f)
                close()
                moveTo(4f, 7f)
                horizontalLineTo(20f)
                curveTo(20f, 7.263f, 20.052f, 7.523f, 20.152f, 7.765f)
                curveTo(20.253f, 8.008f, 20.4f, 8.229f, 20.586f, 8.414f)
                curveTo(20.771f, 8.6f, 20.992f, 8.747f, 21.235f, 8.848f)
                curveTo(21.477f, 8.948f, 21.737f, 9f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(21.737f, 15f, 21.477f, 15.052f, 21.235f, 15.152f)
                curveTo(20.992f, 15.253f, 20.771f, 15.4f, 20.586f, 15.586f)
                curveTo(20.4f, 15.771f, 20.253f, 15.992f, 20.152f, 16.235f)
                curveTo(20.052f, 16.477f, 20f, 16.737f, 20f, 17f)
                horizontalLineTo(4f)
                curveTo(4f, 16.737f, 3.948f, 16.477f, 3.848f, 16.235f)
                curveTo(3.747f, 15.992f, 3.6f, 15.771f, 3.414f, 15.586f)
                curveTo(3.228f, 15.4f, 3.008f, 15.253f, 2.765f, 15.152f)
                curveTo(2.523f, 15.052f, 2.263f, 15f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2.263f, 9f, 2.523f, 8.948f, 2.765f, 8.848f)
                curveTo(3.008f, 8.747f, 3.228f, 8.6f, 3.414f, 8.414f)
                curveTo(3.6f, 8.229f, 3.747f, 8.008f, 3.848f, 7.765f)
                curveTo(3.948f, 7.523f, 4f, 7.263f, 4f, 7f)
                close()
            }
        }.build()

        return _Cash!!
    }

@Suppress("ObjectPropertyName")
private var _Cash: ImageVector? = null
