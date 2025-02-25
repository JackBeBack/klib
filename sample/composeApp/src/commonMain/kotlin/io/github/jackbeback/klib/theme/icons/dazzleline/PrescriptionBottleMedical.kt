package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PrescriptionBottleMedical: ImageVector
    get() {
        if (_PrescriptionBottleMedical != null) {
            return _PrescriptionBottleMedical!!
        }
        _PrescriptionBottleMedical = ImageVector.Builder(
            name = "PrescriptionBottleMedical",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                horizontalLineTo(14f)
                moveTo(12f, 12f)
                verticalLineTo(16f)
                moveTo(7f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(16.8f)
                curveTo(17f, 17.92f, 17f, 18.48f, 16.782f, 18.908f)
                curveTo(16.59f, 19.284f, 16.284f, 19.59f, 15.908f, 19.782f)
                curveTo(15.48f, 20f, 14.92f, 20f, 13.8f, 20f)
                horizontalLineTo(10.2f)
                curveTo(9.08f, 20f, 8.52f, 20f, 8.092f, 19.782f)
                curveTo(7.716f, 19.59f, 7.41f, 19.284f, 7.218f, 18.908f)
                curveTo(7f, 18.48f, 7f, 17.92f, 7f, 16.8f)
                verticalLineTo(8f)
                close()
                moveTo(6f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _PrescriptionBottleMedical!!
    }

@Suppress("ObjectPropertyName")
private var _PrescriptionBottleMedical: ImageVector? = null
