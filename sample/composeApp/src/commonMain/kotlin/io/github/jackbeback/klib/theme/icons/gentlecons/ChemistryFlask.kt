package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChemistryFlask: ImageVector
    get() {
        if (_ChemistryFlask != null) {
            return _ChemistryFlask!!
        }
        _ChemistryFlask = ImageVector.Builder(
            name = "ChemistryFlask",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 17f)
                curveTo(10.552f, 17f, 11f, 16.552f, 11f, 16f)
                curveTo(11f, 15.448f, 10.552f, 15f, 10f, 15f)
                curveTo(9.448f, 15f, 9f, 15.448f, 9f, 16f)
                curveTo(9f, 16.552f, 9.448f, 17f, 10f, 17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 18f)
                curveTo(15f, 18.552f, 14.552f, 19f, 14f, 19f)
                curveTo(13.448f, 19f, 13f, 18.552f, 13f, 18f)
                curveTo(13f, 17.448f, 13.448f, 17f, 14f, 17f)
                curveTo(14.552f, 17f, 15f, 17.448f, 15f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 3f)
                verticalLineTo(7.582f)
                curveTo(17.932f, 8.768f, 20f, 11.643f, 20f, 15f)
                curveTo(20f, 19.418f, 16.418f, 23f, 12f, 23f)
                curveTo(7.582f, 23f, 4f, 19.418f, 4f, 15f)
                curveTo(4f, 11.643f, 6.068f, 8.768f, 9f, 7.582f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                curveTo(7.448f, 3f, 7f, 2.552f, 7f, 2f)
                curveTo(7f, 1.448f, 7.448f, 1f, 8f, 1f)
                horizontalLineTo(16f)
                curveTo(16.552f, 1f, 17f, 1.448f, 17f, 2f)
                curveTo(17f, 2.552f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(15f)
                close()
                moveTo(9.75f, 9.435f)
                lineTo(10.375f, 9.182f)
                curveTo(10.753f, 9.03f, 11f, 8.663f, 11f, 8.256f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(8.256f)
                curveTo(13f, 8.663f, 13.247f, 9.03f, 13.625f, 9.182f)
                lineTo(14.25f, 9.435f)
                curveTo(15.108f, 9.783f, 15.866f, 10.322f, 16.473f, 11f)
                lineTo(7.527f, 11f)
                curveTo(8.134f, 10.322f, 8.892f, 9.783f, 9.75f, 9.435f)
                close()
                moveTo(6.341f, 13f)
                curveTo(6.12f, 13.626f, 6f, 14.299f, 6f, 15f)
                curveTo(6f, 18.314f, 8.686f, 21f, 12f, 21f)
                curveTo(15.314f, 21f, 18f, 18.314f, 18f, 15f)
                curveTo(18f, 14.299f, 17.88f, 13.626f, 17.659f, 13f)
                lineTo(6.341f, 13f)
                close()
            }
        }.build()

        return _ChemistryFlask!!
    }

@Suppress("ObjectPropertyName")
private var _ChemistryFlask: ImageVector? = null
