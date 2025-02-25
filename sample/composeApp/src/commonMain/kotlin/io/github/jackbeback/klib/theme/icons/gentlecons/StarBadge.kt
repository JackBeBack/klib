package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.StarBadge: ImageVector
    get() {
        if (_StarBadge != null) {
            return _StarBadge!!
        }
        _StarBadge = ImageVector.Builder(
            name = "StarBadge",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.861f, 1.292f)
                curveTo(11.46f, 0.594f, 12.54f, 0.594f, 13.139f, 1.292f)
                lineTo(15.415f, 3.948f)
                lineTo(18.768f, 3.575f)
                curveTo(19.724f, 3.469f, 20.531f, 4.276f, 20.425f, 5.232f)
                lineTo(20.052f, 8.585f)
                lineTo(22.708f, 10.861f)
                curveTo(23.406f, 11.46f, 23.406f, 12.54f, 22.708f, 13.139f)
                lineTo(20.052f, 15.415f)
                lineTo(20.425f, 18.768f)
                curveTo(20.531f, 19.724f, 19.724f, 20.531f, 18.768f, 20.425f)
                lineTo(15.415f, 20.052f)
                lineTo(13.139f, 22.708f)
                curveTo(12.54f, 23.406f, 11.46f, 23.406f, 10.861f, 22.708f)
                lineTo(8.585f, 20.052f)
                lineTo(5.232f, 20.425f)
                curveTo(4.276f, 20.531f, 3.469f, 19.724f, 3.575f, 18.768f)
                lineTo(3.948f, 15.415f)
                lineTo(1.292f, 13.139f)
                curveTo(0.594f, 12.54f, 0.594f, 11.46f, 1.292f, 10.861f)
                lineTo(3.948f, 8.585f)
                lineTo(3.575f, 5.232f)
                curveTo(3.469f, 4.276f, 4.276f, 3.469f, 5.232f, 3.575f)
                lineTo(8.585f, 3.948f)
                lineTo(10.861f, 1.292f)
                close()
                moveTo(12f, 3.037f)
                lineTo(9.931f, 5.45f)
                curveTo(9.608f, 5.827f, 9.12f, 6.019f, 8.627f, 5.965f)
                lineTo(5.632f, 5.632f)
                lineTo(5.965f, 8.627f)
                curveTo(6.019f, 9.12f, 5.827f, 9.608f, 5.45f, 9.931f)
                lineTo(3.037f, 12f)
                lineTo(5.45f, 14.069f)
                curveTo(5.827f, 14.392f, 6.019f, 14.88f, 5.965f, 15.373f)
                lineTo(5.632f, 18.368f)
                lineTo(8.627f, 18.035f)
                curveTo(9.12f, 17.98f, 9.608f, 18.173f, 9.931f, 18.55f)
                lineTo(12f, 20.963f)
                lineTo(14.069f, 18.55f)
                curveTo(14.392f, 18.173f, 14.88f, 17.98f, 15.373f, 18.035f)
                lineTo(18.368f, 18.368f)
                lineTo(18.035f, 15.373f)
                curveTo(17.98f, 14.88f, 18.173f, 14.392f, 18.55f, 14.069f)
                lineTo(20.963f, 12f)
                lineTo(18.55f, 9.931f)
                curveTo(18.173f, 9.608f, 17.98f, 9.12f, 18.035f, 8.627f)
                lineTo(18.368f, 5.632f)
                lineTo(15.373f, 5.965f)
                curveTo(14.88f, 6.019f, 14.392f, 5.827f, 14.069f, 5.45f)
                lineTo(12f, 3.037f)
                close()
            }
        }.build()

        return _StarBadge!!
    }

@Suppress("ObjectPropertyName")
private var _StarBadge: ImageVector? = null
